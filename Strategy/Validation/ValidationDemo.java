package Strategy.Validation;

public class ValidationDemo {
    public static void main(String[] args) {
        System.out.println("=== Form Validation System ===\n");
        
        Validator validator = new Validator();
        
        System.out.println("--- Email Validation ---");
        validator.setStrategy(new EmailValidation());
        validator.validate("user@example.com");
        validator.validate("invalid-email");
        validator.validate("test@domain");
        
        System.out.println("\n--- Password Validation ---");
        validator.setStrategy(new PasswordValidation());
        validator.validate("P@ssw0rd123");
        validator.validate("weak");
        validator.validate("NoSpecialChar123");
        
        System.out.println("\n--- Phone Number Validation ---");
        validator.setStrategy(new PhoneValidation());
        validator.validate("01712345678");
        validator.validate("123");
        validator.validate("12345678901");
        
        System.out.println("\n--- Credit Card Validation ---");
        validator.setStrategy(new CreditCardValidation());
        validator.validate("1234567812345678");
        validator.validate("1234 5678 1234 5678");
        validator.validate("123456");
    }
}
