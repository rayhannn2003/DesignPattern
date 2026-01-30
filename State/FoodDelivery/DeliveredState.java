package State.FoodDelivery;

public class DeliveredState implements OrderState {
    
    @Override
    public void confirm(Order order) {
        System.out.println("Order is already delivered.");
    }
    
    @Override
    public void ship(Order order) {
        System.out.println("Order is already delivered.");
    }
    
    @Override
    public void deliver(Order order) {
        System.out.println("Order is already delivered.");
    }
    
    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Order has been delivered.");
    }
    
    @Override
    public String getStatus() {
        return "Delivered";
    }
}
