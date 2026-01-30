package State.FoodDelivery;

public class CancelledState implements OrderState {
    
    @Override
    public void confirm(Order order) {
        System.out.println("Cannot confirm. Order has been cancelled.");
    }
    
    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship. Order has been cancelled.");
    }
    
    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order has been cancelled.");
    }
    
    @Override
    public void cancel(Order order) {
        System.out.println("Order is already cancelled.");
    }
    
    @Override
    public String getStatus() {
        return "Cancelled";
    }
}
