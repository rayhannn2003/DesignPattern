package State.FoodDelivery;

public class Order {
    private String orderId;
    private OrderState state;
    
    public Order(String orderId) {
        this.orderId = orderId;
        this.state = new PlacedState();
    }
    
    public void setState(OrderState state) {
        this.state = state;
    }
    
    public String getStatus() {
        return state.getStatus();
    }
    
    public void confirm() {
        state.confirm(this);
    }
    
    public void ship() {
        state.ship(this);
    }
    
    public void deliver() {
        state.deliver(this);
    }
    
    public void cancel() {
        state.cancel(this);
    }
    
    public void displayStatus() {
        System.out.println("Order " + orderId + " is currently: " + getStatus());
    }
}
