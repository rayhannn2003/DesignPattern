# Mediator Pattern Implementation

## Overview
The Mediator pattern has been successfully implemented to resolve **Issue 1: Communication and Coordination Problems**.

## Problem Addressed
### Before Refactoring:
- **Tight Coupling**: `Student` directly called `Course` methods (`tryEnroll`, `addToWaitlist`, `dropStudent`)
- **Bidirectional Dependencies**: `Course` directly manipulated `Student` objects (e.g., when promoting from waitlist)
- **ConsoleUI Scattered Calls**: `ConsoleUI` directly called both `Student` and `Course` methods ❌
- **Scattered Logic**: Enrollment business logic was split between `Student` and `Course` classes
- **Duplicate State**: Both classes maintained duplicate state (lists of enrolled/waitlisted courses)
- **No Central Coordination**: No single component validated or coordinated complete operations

### After Refactoring:
- **Central Mediator**: `RegistrarSystem` now acts as the mediator coordinating all interactions
- **Decoupled Communication**: `Student` and `Course` no longer directly call each other's methods
- **ConsoleUI Delegates to Mediator**: All operations go through `registrar` (mediator) ✅
- **Single Responsibility**: Each class has a clear, focused responsibility
- **Coordinated Operations**: All enrollment, waitlist, and drop operations go through the mediator

## Implementation Details

### 1. Mediator Interface (`CourseMediator.java`)
```java
public interface CourseMediator {
    // Student-initiated operations
    void enrollStudent(Student student, Course course);
    void waitlistStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    
    // Admin operations
    void setCourseStatus(Course course, CourseStatus newStatus);
    void setCourseStatusInteractive(Course course, CourseStatus newStatus, Scanner scanner);
    void setCourseCapacity(Course course, int newCapacity);
    
    // Coordination methods (called by Course)
    void notifyEnrollmentSuccess(Student student, Course course);
    void notifyWaitlistSuccess(Student student, Course course);
    void notifyStudentRemoved(Student student, Course course);
    void promoteFromWaitlist(Course course);
    void handleAutomaticStateTransition(Course course);
}
```

### 2. Concrete Mediator (`RegistrarSystem.java`)
- **Implements** `CourseMediator` interface
- **Coordinates** all interactions between `Student` and `Course`
- **Validates** operations before delegating to appropriate objects
- **Updates** both student and course state consistently
- **Handles** complex operations like waitlist promotion through the mediator

Key responsibilities:
- Registration of students and courses (sets mediator reference)
- Validation of enrollment preconditions (visibility, duplicates)
- Coordination of state updates across objects
- Management of automatic state transitions
- Promotion from waitlist when seats become available

### 3. Refactored Student Class
**Changes:**
- Added `mediator` reference
- Added `setMediator()` method
- Added helper methods: `isEnrolledIn()`, `isWaitlistedFor()`
- Modified `enrollIn()`, `waitlistFor()`, `dropCourse()` to delegate to mediator
- Kept direct update methods for mediator to call: `addEnrolledCourseDirect()`, etc.
- **Print functions remain unchanged** in their original location

**Key Point:** Student no longer calls Course methods directly!

### 4. Refactored Course Class
**Changes:**
- Added `mediator` reference  
- Added `setMediator()` method
- Modified `tryEnroll()` to call `mediator.notifyEnrollmentSuccess()` instead of `student.addEnrolledCourseDirect()`
- Modified `addToWaitlist()` to call `mediator.notifyWaitlistSuccess()`
- Modified `dropStudent()` to call `mediator.notifyStudentRemoved()` and `mediator.promoteFromWaitlist()`
- Modified `cancelCourse()` to use mediator for student notifications
- Added helper methods for mediator: `pollFromWaitlist()`, `addEnrolledDirect()`, `setStatusDirect()`
- **Print functions remain unchanged** in their original location

**Key Point:** Course no longer calls Student methods directly!

### 5. Refactored ConsoleUI Class
**Changes:**
- Modified student enrollment: `s.enrollIn(course)` → `registrar.enrollStudent(s, course)`
- Modified student waitlisting: `s.waitlistFor(course)` → `registrar.waitlistStudent(s, course)`
- Modified student drop: `s.dropCourse(course)` → `registrar.dropStudent(s, course)`
- Modified admin status change: `course.setStatusAdminInteractive()` → `registrar.setCourseStatusInteractive()`
- Modified admin capacity change: `course.setCapacity()` → `registrar.setCourseCapacity()`
- **Read-only operations preserved**: `s.printSchedule()`, `course.printRoster()`, `course.status`

**Key Point:** ConsoleUI only calls the mediator for all operations! No direct Student/Course method calls!

## Flow Diagrams

### Before (Tight Coupling):
```
ConsoleUI --> Student.enrollIn() --> Course.tryEnroll() --> Student.addEnrolledCourseDirect()
ConsoleUI --> Course.setStatusAdmin()
```

### After (Mediator Pattern):
```
ConsoleUI --> RegistrarSystem.enrollStudent() --> Course.tryEnroll()
                    ↓
              RegistrarSystem.notifyEnrollmentSuccess() --> Student.addEnrolledCourseDirect()

ConsoleUI --> RegistrarSystem.setCourseStatus() --> Course.setStatusAdmin()
```

## Communication Table

| Component | Before | After |
|-----------|--------|-------|
| Student → Course | ✗ Direct calls to tryEnroll() | ✓ No direct calls |
| Course → Student | ✗ Direct calls to addEnrolledCourseDirect() | ✓ No direct calls |
| ConsoleUI → Student | ✗ Direct calls to enrollIn() | ✓ Only printSchedule() (read-only) |
| ConsoleUI → Course | ✗ Direct calls to setStatusAdmin() | ✓ Only printRoster() (read-only) |
| ConsoleUI → Mediator | ✗ Only getCourse/getStudent | ✓ All operations go through mediator |

## Benefits Achieved

1. **Decoupling**: Student and Course are no longer tightly coupled ✅
2. **Single Point of Coordination**: All operations go through RegistrarSystem ✅
3. **ConsoleUI Independence**: UI doesn't know about Student-Course interaction details ✅
4. **Easier Maintenance**: Changes to enrollment logic are centralized ✅
5. **Better Testability**: Can test Student and Course independently ✅
6. **Clearer Responsibilities**: Each class has a well-defined role ✅
7. **Consistent State**: Mediator ensures both Student and Course lists stay synchronized ✅

## Testing
- All 25 test scenarios pass ✅
- Output is identical to the original implementation ✅
- No functionality lost or altered ✅
- ConsoleUI refactored without breaking tests ✅

## Design Pattern Justification
The **Mediator pattern** is the perfect solution because:
- It provides "someone who knows all" to coordinate operations
- It eliminates many-to-many relationships between Student and Course
- It centralizes complex coordination logic
- It makes the system more maintainable and extensible
- **ConsoleUI, Student, and Course all communicate only through the mediator**

