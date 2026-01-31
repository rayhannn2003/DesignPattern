package Template.BeverageMaker;

public class BeverageMakerDemo {
    public static void main(String[] args) {
        System.out.println("=== Beverage Maker Template Pattern ===\n");
        
        System.out.println("--- Making Coffee ---");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
        
        System.out.println("\n--- Making Tea ---");
        Beverage tea = new Tea();
        tea.prepareBeverage();
        
        System.out.println("\n--- Making Hot Chocolate ---");
        Beverage hotChocolate = new HotChocolate();
        hotChocolate.prepareBeverage();
        
        System.out.println("\n--- Making Black Coffee ---");
        Beverage blackCoffee = new BlackCoffee();
        blackCoffee.prepareBeverage();
    }
}
