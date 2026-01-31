package Template.BeverageMaker;

public abstract class Beverage {
    
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    private void boilWater() {
        System.out.println("Boiling water");
    }
    
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    protected abstract void brew();
    
    protected abstract void addCondiments();
    
    protected boolean customerWantsCondiments() {
        return true;
    }
}
