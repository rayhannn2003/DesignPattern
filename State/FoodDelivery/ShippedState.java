package State.FoodDelivery;

public class ShippedState implements OrderState {
    
    @Override
    public void confirm(Order order) {
        System.out.println("Order is already shipped. Cannot revert to Confirmed.");
    }
    
    @Override
    public void ship(Order order) {
        System.out.println("Order is already shipped.");
    }
    
    @Override
    public void deliver(Order order) {
        System.out.println("Order delivered successfully. Moving to Delivered state.");
        order.setState(new DeliveredState());
    }
    
    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Order has already been shipped.");
    }
    
    @Override
    public String getStatus() {
        return "Shipped";
    }
}
