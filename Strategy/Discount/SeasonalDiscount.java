package Strategy.Discount;

public class SeasonalDiscount implements DiscountStrategy {
    private double discountRate;
    
    public SeasonalDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double applyDiscount(double price) {
        return price - (price * discountRate);
    }
    
    @Override
    public String getDiscountDescription() {
        return "Seasonal Sale: " + (int)(discountRate * 100) + "% off";
    }
}
