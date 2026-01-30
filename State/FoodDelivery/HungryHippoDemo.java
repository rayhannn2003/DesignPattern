package State.FoodDelivery;

public class HungryHippoDemo {
    public static void main(String[] args) {
        System.out.println("=== HungryHippo Order Management System ===\n");
        
        System.out.println("--- Scenario 1: Successful Delivery ---");
        Order order1 = new Order("#12345");
        order1.displayStatus();
        order1.confirm();
        order1.displayStatus();
        order1.ship();
        order1.displayStatus();
        order1.deliver();
        order1.displayStatus();
        
        System.out.println("\n--- Scenario 2: Cancel Before Shipment ---");
        Order order2 = new Order("#12346");
        order2.displayStatus();
        order2.confirm();
        order2.displayStatus();
        order2.cancel();
        order2.displayStatus();
        
        System.out.println("\n--- Scenario 3: Invalid Transitions ---");
        Order order3 = new Order("#12347");
        order3.displayStatus();
        order3.deliver();
        order3.ship();
        order3.confirm();
        order3.displayStatus();
        
        System.out.println("\n--- Scenario 4: Cancel After Shipment (Not Allowed) ---");
        Order order4 = new Order("#12348");
        order4.confirm();
        order4.ship();
        order4.displayStatus();
        order4.cancel();
        order4.displayStatus();
        
        System.out.println("\n--- Scenario 5: Operations on Delivered Order ---");
        Order order5 = new Order("#12349");
        order5.confirm();
        order5.ship();
        order5.deliver();
        order5.displayStatus();
        order5.cancel();
        order5.ship();
        order5.displayStatus();
    }
}
