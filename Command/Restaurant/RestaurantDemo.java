package Command.Restaurant;

public class RestaurantDemo {
    public static void main(String[] args) {
        System.out.println("=== Restaurant Order Processing System ===\n");
        
        Chef chef = new Chef("Chef Gordon");
        Waiter waiter = new Waiter();
        
        Order burger1 = new BurgerOrder(chef, 1);
        Order pizza2 = new PizzaOrder(chef, 2);
        Order pasta3 = new PastaOrder(chef, 3);
        Order burger4 = new BurgerOrder(chef, 4);
        
        System.out.println("--- Taking orders ---");
        waiter.takeOrder(burger1);
        waiter.takeOrder(pizza2);
        waiter.takeOrder(pasta3);
        waiter.takeOrder(burger4);
        
        System.out.println("\n--- Customer at table 3 cancels order ---");
        waiter.cancelOrder(pasta3);
        
        waiter.submitOrders();
        
        System.out.println("\n--- New batch of orders ---");
        Order pizza5 = new PizzaOrder(chef, 5);
        Order burger6 = new BurgerOrder(chef, 6);
        
        waiter.takeOrder(pizza5);
        waiter.takeOrder(burger6);
        waiter.submitOrders();
    }
}
