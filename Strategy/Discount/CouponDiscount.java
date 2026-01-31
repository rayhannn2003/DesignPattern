package Strategy.Discount;

public class CouponDiscount implements DiscountStrategy {
    private double fixedAmount;
    
    public CouponDiscount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
    
    @Override
    public double applyDiscount(double price) {
        return Math.max(0, price - fixedAmount);
    }
    
    @Override
    public String getDiscountDescription() {
        return "Coupon Code: $" + fixedAmount + " off";
    }
}
