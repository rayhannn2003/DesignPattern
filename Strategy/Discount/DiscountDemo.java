package Strategy.Discount;

public class DiscountDemo {
    public static void main(String[] args) {
        System.out.println("=== Shopping Cart Discount System ===\n");
        
        ShoppingCart cart = new ShoppingCart();
        double totalPrice = 500.0;
        
        System.out.println("--- Regular customer ---");
        cart.checkout(totalPrice);
        
        System.out.println("\n--- Seasonal sale (20% off) ---");
        cart.setDiscountStrategy(new SeasonalDiscount(0.20));
        cart.checkout(totalPrice);
        
        System.out.println("\n--- Loyalty member (15% off) ---");
        cart.setDiscountStrategy(new LoyaltyDiscount(0.15));
        cart.checkout(totalPrice);
        
        System.out.println("\n--- Bulk purchase with 60 items ---");
        cart.setDiscountStrategy(new BulkDiscount(50, 0.25, 60));
        cart.checkout(totalPrice);
        
        System.out.println("\n--- Bulk purchase with only 30 items ---");
        cart.setDiscountStrategy(new BulkDiscount(50, 0.25, 30));
        cart.checkout(totalPrice);
        
        System.out.println("\n--- Coupon code applied ($75 off) ---");
        cart.setDiscountStrategy(new CouponDiscount(75));
        cart.checkout(totalPrice);
        
        System.out.println("\n--- Black Friday: Seasonal + Loyalty ---");
        System.out.println("(First apply seasonal, then loyalty on reduced price)");
        double afterSeasonal = new SeasonalDiscount(0.20).applyDiscount(totalPrice);
        cart.setDiscountStrategy(new LoyaltyDiscount(0.15));
        cart.checkout(afterSeasonal);
    }
}
