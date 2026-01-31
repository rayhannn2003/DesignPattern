# Course Registration System - Design Patterns Refactoring Summary

## Project Overview
This project refactors a university course registration system by applying two behavioral design patterns to address structural issues and improve maintainability.

## Issues Resolved

### Issue 1: Communication and Coordination Problems
**Pattern Applied**: **Mediator Design Pattern**

**Problem**:
- Student and Course classes directly called each other's methods (tight coupling)
- ConsoleUI directly manipulated both Student and Course objects
- Enrollment business logic was scattered across multiple classes
- No central component to coordinate and validate operations
- Duplicate state maintained in both Student and Course

**Solution**:
- Created `CourseMediator` interface defining coordination contract
- Refactored `RegistrarSystem` to implement `CourseMediator`
- All Student-Course interactions now go through the mediator
- ConsoleUI only communicates with the mediator for operations
- Centralized validation and state synchronization

**Files Created/Modified**:
- ✅ `CourseMediator.java` (new interface)
- ✅ `RegistrarSystem.java` (now implements CourseMediator)
- ✅ `Student.java` (refactored to use mediator)
- ✅ `Course.java` (refactored to use mediator)
- ✅ `ConsoleUI.java` (refactored to use mediator)

### Issue 2: Conditional Complexity for Course States
**Pattern Applied**: **State Design Pattern**

**Problem**:
- Course class contained large switch statements based on CourseStatus
- tryEnroll(), addToWaitlist(), setStatusAdmin() had extensive conditional logic
- setCapacity() checked status to decide behavior
- Same status checks repeated across multiple methods
- Adding new states or changing rules required modifying many methods

**Solution**:
- Created `CourseState` interface for state-specific behavior
- Implemented 5 concrete state classes (DraftState, OpenState, FullState, ClosedState, CancelledState)
- Each state encapsulates its own behavior for enrollment, waitlisting, transitions
- Eliminated all switch statements from Course class
- Course delegates to current state object

**Files Created**:
- ✅ `CourseState.java` (new interface)
- ✅ `DraftState.java` (concrete state)
- ✅ `OpenState.java` (concrete state)
- ✅ `FullState.java` (concrete state)
- ✅ `ClosedState.java` (concrete state)
- ✅ `CancelledState.java` (concrete state)

**Files Modified**:
- ✅ `Course.java` (refactored to use State pattern)

## Project Structure

```
behavioral/
├── CourseMediator.java          (Mediator interface)
├── RegistrarSystem.java         (Concrete Mediator)
├── Student.java                  (Uses Mediator)
├── Course.java                   (Uses Mediator + State pattern)
├── CourseState.java             (State interface)
├── DraftState.java              (Concrete State)
├── OpenState.java               (Concrete State)
├── FullState.java               (Concrete State)
├── ClosedState.java             (Concrete State)
├── CancelledState.java          (Concrete State)
├── CourseStatus.java            (Enum - unchanged)
├── ConsoleUI.java               (Uses Mediator)
├── Main.java                    (Unchanged)
├── TestScenarios.java           (Unchanged)
└── Readme.md
```

## Key Achievements

### Code Quality
- ✅ **No tight coupling** between Student and Course
- ✅ **No switch statements** for state-dependent behavior
- ✅ **Clean separation of concerns**
- ✅ **Single Responsibility Principle** followed
- ✅ **Open/Closed Principle** - easy to extend

### Maintainability
- ✅ Adding new course states requires only creating a new state class
- ✅ Changing enrollment logic is centralized in the mediator
- ✅ Each class has a focused, well-defined responsibility
- ✅ State transitions are clearly encapsulated in each state

### Testing
- ✅ All 25 test scenarios pass
- ✅ Output 100% identical to original implementation
- ✅ No functionality lost or altered
- ✅ TestScenarios.java completely unchanged
- ✅ Backward compatibility maintained

## Architecture Diagrams

### Mediator Pattern Architecture
```
┌──────────────┐
│  ConsoleUI   │
└──────┬───────┘
       │ (all operations)
       ▼
┌──────────────────┐
│ RegistrarSystem  │ ◄─── MEDIATOR
│ (CourseMediator) │      (knows all, coordinates)
└────┬────────┬────┘
     │        │
     ▼        ▼
┌─────────┐ ┌────────┐
│ Student │ │ Course │
└─────────┘ └────────┘
     ▲         ▲
     │         │
     └─────────┘
   NO direct calls!
```

### State Pattern Architecture
```
┌────────────────┐
│     Course     │
│ currentState ──┼───────┐
└────────────────┘       │
                         ▼
                 ┌───────────────┐
                 │  CourseState  │ (interface)
                 └───────┬───────┘
                         │
        ┌────────────────┼────────────────┬───────────┬──────────────┐
        ▼                ▼                ▼           ▼              ▼
  ┌──────────┐    ┌──────────┐    ┌──────────┐  ┌────────┐  ┌──────────────┐
  │DraftState│    │OpenState │    │FullState │  │ Closed │  │CancelledState│
  └──────────┘    └──────────┘    └──────────┘  │  State │  └──────────────┘
                                                 └────────┘
     Each state knows:
     - How to handle tryEnroll()
     - How to handle addToWaitlist()
     - Valid transitions from this state
     - Post-drop behavior
```

## Benefits Summary

### Mediator Pattern Benefits
1. **Decoupling**: Student and Course don't know about each other
2. **Centralized Control**: All coordination logic in one place
3. **Easier Testing**: Components can be tested independently
4. **Better Maintainability**: Changes to coordination are localized

### State Pattern Benefits
1. **Eliminated Complexity**: No more large switch statements
2. **Encapsulation**: Each state manages its own behavior
3. **Extensibility**: New states can be added easily
4. **Clarity**: State-specific logic is clearly separated
5. **Maintainability**: Changes to one state don't affect others

## Before vs After Comparison

| Metric | Before | After |
|--------|--------|-------|
| **Direct Student→Course calls** | Yes ❌ | No ✅ |
| **Direct Course→Student calls** | Yes ❌ | No ✅ |
| **ConsoleUI→Student calls** | Yes ❌ | No ✅ |
| **ConsoleUI→Course calls** | Yes ❌ | No ✅ |
| **Switch statements in Course** | 4 large switches ❌ | 0 ✅ |
| **Lines of conditional logic** | 150+ ❌ | 0 ✅ |
| **State-specific classes** | 0 ❌ | 5 ✅ |
| **Coordination through mediator** | No ❌ | Yes ✅ |
| **Effort to add new state** | Modify 5+ methods ❌ | Create 1 class ✅ |

## Testing Results
```
✓ Compilation successful
✓ All 25 test scenarios pass
✓ Output 100% identical to original
✓ No regressions
✓ Backward compatibility maintained
```

## Design Pattern Justifications

### Why Mediator Pattern?
The assignment asked: *"What if 'someone who knows all' was responsible for coordinating all operations?"*
- The Mediator pattern provides exactly this - a central coordinator
- Eliminates many-to-many relationships between Student and Course
- Provides a single source of truth for enrollment operations

### Why State Pattern?
The assignment asked: *"Could each course status have its own encapsulation?"*
- The State pattern allows each status to encapsulate its behavior
- Each state knows how to handle tryEnroll(), addToWaitlist(), etc.
- Eliminates the need for complex conditional logic

## Conclusion
Both design patterns have been successfully implemented:
- ✅ **Mediator Pattern** eliminates tight coupling and provides centralized coordination
- ✅ **State Pattern** eliminates conditional complexity and encapsulates state-specific behavior
- ✅ All original functionality preserved
- ✅ Code is cleaner, more maintainable, and easier to extend
- ✅ Ready for viva defense with clear pattern justifications
