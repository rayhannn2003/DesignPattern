package Strategy.Discount;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;
    
    public ShoppingCart() {
        this.discountStrategy = new NoDiscount();
    }
    
    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }
    
    public void checkout(double totalPrice) {
        System.out.println("Original Price: $" + totalPrice);
        System.out.println("Discount: " + discountStrategy.getDiscountDescription());
        double finalPrice = discountStrategy.applyDiscount(totalPrice);
        System.out.println("Final Price: $" + String.format("%.2f", finalPrice));
        System.out.println("You saved: $" + String.format("%.2f", totalPrice - finalPrice));
    }
}
