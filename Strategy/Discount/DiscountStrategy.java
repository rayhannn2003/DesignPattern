package Strategy.Discount;

public interface DiscountStrategy {
    double applyDiscount(double price);
    String getDiscountDescription();
}
