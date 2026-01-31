package Strategy.Validation;

public class EmailValidation implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        return input != null && input.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
    
    @Override
    public String getErrorMessage() {
        return "Invalid email format. Expected: user@example.com";
    }
}
