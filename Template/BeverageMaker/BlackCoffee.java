package Template.BeverageMaker;

public class BlackCoffee extends Beverage {
    
    @Override
    protected void brew() {
        System.out.println("Brewing strong black coffee");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("No condiments for black coffee");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
