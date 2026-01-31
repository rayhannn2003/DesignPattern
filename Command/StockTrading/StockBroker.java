package Command.StockTrading;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
    private List<Order> orderQueue;
    private List<Order> executedOrders;
    
    public StockBroker() {
        this.orderQueue = new ArrayList<>();
        this.executedOrders = new ArrayList<>();
    }
    
    public void takeOrder(Order order) {
        orderQueue.add(order);
        System.out.println("Order queued: " + order.getOrderDetails());
    }
    
    public void cancelOrder(Order order) {
        if (orderQueue.remove(order)) {
            order.cancel();
        } else {
            System.out.println("Order not in queue (may have been executed)");
        }
    }
    
    public void placeOrders() {
        System.out.println("\n--- Executing all pending orders ---");
        for (Order order : orderQueue) {
            order.execute();
            executedOrders.add(order);
        }
        orderQueue.clear();
    }
    
    public void showTransactionLog() {
        System.out.println("\n--- Transaction Log ---");
        for (Order order : executedOrders) {
            System.out.println("Executed: " + order.getOrderDetails());
        }
    }
}
