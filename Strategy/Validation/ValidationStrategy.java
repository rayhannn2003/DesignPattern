package Strategy.Validation;

public interface ValidationStrategy {
    boolean validate(String input);
    String getErrorMessage();
}
