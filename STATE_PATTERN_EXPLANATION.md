# State Design Pattern Implementation

## Overview
The State design pattern has been successfully implemented to resolve **Issue 2: Conditional Complexity for Course States**.

## Problem Addressed

### Before Refactoring:
- **Large Switch Statements**: `tryEnroll()` used extensive switch logic checking current status
- **Scattered Conditionals**: `addToWaitlist()` had conditional logic repeated across methods
- **Complex Transition Logic**: `setStatusAdmin()` had deeply nested conditionals for each state
- **Capacity-based Conditionals**: `setCapacity()` checked status to decide behavior
- **Difficult to Extend**: Adding new states or changing transition rules required modifying multiple methods
- **Code Duplication**: The same status checks appeared repeatedly across different methods

### After Refactoring:
- **Encapsulated State Behavior**: Each course status has its own class with specific behavior
- **No Switch Statements**: All conditional logic eliminated from Course class
- **Delegated Behavior**: Course delegates all state-dependent operations to current state object
- **Easy to Extend**: Adding new states only requires creating a new state class
- **Clean Transitions**: Each state knows its valid transitions and handles them internally

## Implementation Details

### 1. State Interface (`CourseState.java`)
```java
public interface CourseState {
    boolean tryEnroll(Student student, Course course, CourseMediator mediator);
    boolean addToWaitlist(Student student, Course course, CourseMediator mediator);
    void setCapacity(int newCapacity, Course course);
    void transitionTo(CourseStatus newStatus, Course course, CourseMediator mediator);
    void transitionToInteractive(CourseStatus newStatus, Course course, CourseMediator mediator, Scanner scanner);
    CourseStatus getStatus();
    boolean isVisibleToStudents();
    void handleDrop(Course course, CourseMediator mediator);
}
```

### 2. Five Concrete State Classes

#### `DraftState`
- **Enrollment**: Rejects all enrollment attempts (not visible to students)
- **Waitlist**: Rejects waitlisting
- **Capacity Changes**: Accepts but doesn't change state
- **Transitions**: DRAFT → OPEN, CLOSED, CANCELLED
- **Visibility**: Not visible to students

#### `OpenState`
- **Enrollment**: Accepts enrollment if capacity available, transitions to FULL when full
- **Waitlist**: Rejects (suggests enrolling instead)
- **Capacity Changes**: May transition to FULL based on new capacity
- **Transitions**: OPEN → CLOSED, DRAFT, CANCELLED
- **Drop Handling**: Promotes from waitlist if available
- **Visibility**: Visible to students

#### `FullState`
- **Enrollment**: Rejects (suggests waitlisting)
- **Waitlist**: Accepts waitlist requests
- **Capacity Changes**: May transition to OPEN if capacity increased
- **Transitions**: FULL → CLOSED (with random waitlist selection), CANCELLED
- **Drop Handling**: Promotes from waitlist, may transition to OPEN
- **Interactive Closing**: Prompts admin for capacity increase when transitioning to CLOSED
- **Visibility**: Visible to students

#### `ClosedState`
- **Enrollment**: Rejects all enrollment
- **Waitlist**: Rejects waitlisting
- **Capacity Changes**: May transition to OPEN or FULL based on capacity vs enrolled
- **Transitions**: CLOSED → OPEN, DRAFT, CANCELLED
- **Visibility**: Visible to students

#### `CancelledState`
- **Enrollment**: Rejects all enrollment
- **Waitlist**: Rejects waitlisting
- **Capacity Changes**: Accepts but has no effect
- **Transitions**: CANCELLED → DRAFT only (for reinstating)
- **Visibility**: Not visible to students

### 3. Refactored Course Class

**Key Changes:**
- Replaced `CourseStatus status` field with `CourseState currentState`
- Added `CourseStatus status` public field for backward compatibility (kept in sync)
- **Eliminated ALL switch statements and conditional logic**
- Delegated all state-dependent behavior to state objects:
  - `tryEnroll()` → `currentState.tryEnroll()`
  - `addToWaitlist()` → `currentState.addToWaitlist()`
  - `setCapacity()` → `currentState.setCapacity()`
  - `setStatusAdmin()` → `currentState.transitionTo()`
  - `dropStudent()` → `currentState.handleDrop()` (for post-drop logic)

**Helper Methods Added for States:**
- `setState(CourseState newState)` - Changes current state
- `setCapacityDirect(int)` - Direct capacity modification
- `isEnrolled(Student)`, `isWaitlisted(Student)` - Check student status
- `addToWaitlistDirect(Student)`, `removeFromWaitlistDirect(Student)` - Waitlist operations
- `hasWaitlist()`, `getWaitlistCopy()` - Waitlist queries
- `cancelCourseDirect(CourseMediator)` - Cancellation logic

### 4. State Instantiation
**New instance per transition** (as requested):
- Each state transition creates a new state object
- Example: `course.setState(new OpenState())`
- States don't maintain course-specific data (stateless behavior objects)

## Flow Comparison

### Before (Switch-based):
```java
public boolean tryEnroll(Student s) {
    switch (status) {
        case OPEN:
            // Complex enrollment logic
            if (enrolled.size() < capacity) {
                // ...
                status = CourseStatus.FULL; // Direct status change
            }
            break;
        case FULL:
            // Rejection logic
            break;
        // ... more cases
    }
}
```

### After (State Pattern):
```java
public boolean tryEnroll(Student s) {
    return currentState.tryEnroll(s, this, mediator);
}

// In OpenState.java:
public boolean tryEnroll(Student s, Course course, CourseMediator mediator) {
    if (course.getEnrolledCount() < course.getCapacity()) {
        // ...
        course.setState(new FullState()); // State transition
    }
}
```

## Transition Logic Encapsulation

### FULL → CLOSED with Random Waitlist Selection
**Before**: Complex logic in `closeWithRandomWaitlistSelection()` method in Course class

**After**: Encapsulated in `FullState.transitionToInteractive()`:
- Prompts admin for capacity increase (interactive mode)
- Randomly selects students from waitlist
- Promotes selected students to enrolled
- Transitions to ClosedState
- All logic contained within FullState

## Benefits Achieved

1. **Eliminated Conditional Complexity**: ✅ No more switch statements or nested ifs
2. **Single Responsibility**: ✅ Each state class handles only its own behavior
3. **Open/Closed Principle**: ✅ Can add new states without modifying existing code
4. **Improved Readability**: ✅ State-specific logic is clearly separated
5. **Easier Testing**: ✅ Each state can be tested independently
6. **Simplified Course Class**: ✅ Course is now a simple delegator
7. **Clear State Transitions**: ✅ Each state knows its valid transitions

## Comparison Table

| Aspect | Before | After |
|--------|--------|-------|
| tryEnroll() | 30+ lines with switch | 2 lines (delegates to state) |
| addToWaitlist() | 20+ lines with switch | 2 lines (delegates to state) |
| setStatusAdmin() | 80+ lines with nested switches | 5 lines (delegates to state) |
| setCapacity() | 25+ lines with conditionals | 2 lines (delegates to state) |
| State transitions | Scattered across Course class | Encapsulated in each state |
| Adding new state | Modify 5+ methods | Create 1 new state class |

## Testing
- All 25 test scenarios pass ✅
- Output is identical to the original implementation ✅
- No functionality lost or altered ✅
- All state transitions work correctly ✅

## Design Pattern Justification
The **State pattern** is the perfect solution because:
- Each course status naturally has different behavior for the same operations
- State transitions are well-defined and can be encapsulated
- Eliminates the need for complex conditional logic
- Makes the system easy to extend with new states
- **Each state "knows" how to handle tryEnroll(), addToWaitlist(), canTransitionTo(), etc.**
