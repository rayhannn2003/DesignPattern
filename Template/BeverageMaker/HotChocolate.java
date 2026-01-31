package Template.BeverageMaker;

public class HotChocolate extends Beverage {
    
    @Override
    protected void brew() {
        System.out.println("Mixing chocolate powder with hot water");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding whipped cream and marshmallows");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        return true;
    }
}
