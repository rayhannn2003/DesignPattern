package State.FoodDelivery;

public class PlacedState implements OrderState {
    
    @Override
    public void confirm(Order order) {
        System.out.println("Order confirmed. Moving to Confirmed state.");
        order.setState(new ConfirmedState());
    }
    
    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship. Order must be confirmed first.");
    }
    
    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order must be shipped first.");
    }
    
    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled from Placed state.");
        order.setState(new CancelledState());
    }
    
    @Override
    public String getStatus() {
        return "Placed";
    }
}
