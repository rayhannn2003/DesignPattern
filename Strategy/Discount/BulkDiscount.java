package Strategy.Discount;

public class BulkDiscount implements DiscountStrategy {
    private int minQuantity;
    private double discountRate;
    private int currentQuantity;
    
    public BulkDiscount(int minQuantity, double discountRate, int currentQuantity) {
        this.minQuantity = minQuantity;
        this.discountRate = discountRate;
        this.currentQuantity = currentQuantity;
    }
    
    @Override
    public double applyDiscount(double price) {
        if (currentQuantity >= minQuantity) {
            return price - (price * discountRate);
        }
        return price;
    }
    
    @Override
    public String getDiscountDescription() {
        if (currentQuantity >= minQuantity) {
            return "Bulk Purchase: " + (int)(discountRate * 100) + "% off (" + currentQuantity + " items)";
        }
        return "Bulk discount not applicable (need " + minQuantity + "+ items)";
    }
}
