package Strategy.Discount;

public class LoyaltyDiscount implements DiscountStrategy {
    private double discountRate;
    
    public LoyaltyDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double applyDiscount(double price) {
        return price - (price * discountRate);
    }
    
    @Override
    public String getDiscountDescription() {
        return "Loyalty Member: " + (int)(discountRate * 100) + "% off";
    }
}
