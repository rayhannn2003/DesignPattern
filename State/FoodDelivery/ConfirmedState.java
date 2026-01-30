package State.FoodDelivery;

public class ConfirmedState implements OrderState {
    
    @Override
    public void confirm(Order order) {
        System.out.println("Order is already confirmed.");
    }
    
    @Override
    public void ship(Order order) {
        System.out.println("Order shipped. Moving to Shipped state.");
        order.setState(new ShippedState());
    }
    
    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order must be shipped first.");
    }
    
    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled from Confirmed state.");
        order.setState(new CancelledState());
    }
    
    @Override
    public String getStatus() {
        return "Confirmed";
    }
}
