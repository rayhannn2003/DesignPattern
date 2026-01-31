package Strategy.Validation;

public class Validator {
    private ValidationStrategy strategy;
    
    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void validate(String input) {
        if (strategy == null) {
            System.out.println("No validation strategy set");
            return;
        }
        
        System.out.println("Input: " + input);
        if (strategy.validate(input)) {
            System.out.println("✓ Valid");
        } else {
            System.out.println("✗ Invalid - " + strategy.getErrorMessage());
        }
    }
}
