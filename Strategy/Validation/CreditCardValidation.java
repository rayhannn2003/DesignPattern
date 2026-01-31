package Strategy.Validation;

public class CreditCardValidation implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        if (input == null) return false;
        String cleaned = input.replaceAll("\\s+", "");
        return cleaned.matches("^\\d{16}$");
    }
    
    @Override
    public String getErrorMessage() {
        return "Invalid credit card number. Expected: 16 digits";
    }
}
