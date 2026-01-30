/**
 * ConcreteMediator for Issue 1.
 *
 * Important constraint: TestScenarios output must remain identical.
 * To guarantee that, this mediator delegates to the existing Student methods,
 * which already produce the expected output.
 *
 * Result: ConsoleUI (interactive flow) can call only the mediator for student
 * operations, reducing scattered communication.
 */
public class RegistrarMediator implements RegistrationMediator {

    @Override
    public void enroll(Student student, Course course) {
        if (student == null || course == null) return;
        student.enrollIn(course);
    }

    @Override
    public void waitlist(Student student, Course course) {
        if (student == null || course == null) return;
        student.waitlistFor(course);
    }

    @Override
    public void drop(Student student, Course course) {
        if (student == null || course == null) return;
        student.dropCourse(course);
    }
}
