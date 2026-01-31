package Command.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Order> orderQueue;
    
    public Waiter() {
        this.orderQueue = new ArrayList<>();
    }
    
    public void takeOrder(Order order) {
        orderQueue.add(order);
        System.out.println("Waiter took order: " + order.getOrderDetails());
    }
    
    public void cancelOrder(Order order) {
        if (orderQueue.remove(order)) {
            order.cancel();
        } else {
            System.out.println("Order not found in queue");
        }
    }
    
    public void submitOrders() {
        System.out.println("\n--- Submitting orders to kitchen ---");
        for (Order order : orderQueue) {
            order.execute();
        }
        orderQueue.clear();
    }
}
