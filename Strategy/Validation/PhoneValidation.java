package Strategy.Validation;

public class PhoneValidation implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        return input != null && input.matches("^\\d{10,11}$");
    }
    
    @Override
    public String getErrorMessage() {
        return "Invalid phone number. Expected: 10-11 digits";
    }
}
