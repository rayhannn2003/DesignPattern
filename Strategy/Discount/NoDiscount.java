package Strategy.Discount;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
    
    @Override
    public String getDiscountDescription() {
        return "No discount applied";
    }
}
