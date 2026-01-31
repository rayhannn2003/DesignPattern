package Strategy.Validation;

public class PasswordValidation implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        if (input == null || input.length() < 8) return false;
        boolean hasUpper = input.matches(".*[A-Z].*");
        boolean hasLower = input.matches(".*[a-z].*");
        boolean hasDigit = input.matches(".*\\d.*");
        boolean hasSpecial = input.matches(".*[@#$%^&+=!].*");
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
    
    @Override
    public String getErrorMessage() {
        return "Password must be 8+ chars with uppercase, lowercase, digit, and special character";
    }
}
