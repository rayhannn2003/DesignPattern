/**
 * Mediator interface for Issue 1.
 * The ConsoleUI should call only this interface for student operations.
 */
public interface RegistrationMediator {

        void enroll(Student student, Course course);

        void waitlist(Student student, Course course);

        void drop(Student student, Course course);
}