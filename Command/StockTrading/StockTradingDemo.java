package Command.StockTrading;

public class StockTradingDemo {
    public static void main(String[] args) {
        System.out.println("=== Stock Trading System with Transaction Log ===\n");
        
        Stock appleStock = new Stock("AAPL", 150.0);
        Stock googleStock = new Stock("GOOGL", 2800.0);
        
        StockBroker broker = new StockBroker();
        
        System.out.println("--- Queueing orders ---");
        Order buyApple = new BuyStockOrder(appleStock, 100);
        Order buyGoogle = new BuyStockOrder(googleStock, 50);
        Order sellApple = new SellStockOrder(appleStock, 20);
        
        broker.takeOrder(buyApple);
        broker.takeOrder(buyGoogle);
        broker.takeOrder(sellApple);
        
        System.out.println("\n--- Cancelling one order ---");
        broker.cancelOrder(sellApple);
        
        broker.placeOrders();
        
        System.out.println("\n--- New batch of orders ---");
        Order buyMoreApple = new BuyStockOrder(appleStock, 50);
        Order sellGoogle = new SellStockOrder(googleStock, 10);
        
        broker.takeOrder(buyMoreApple);
        broker.takeOrder(sellGoogle);
        
        broker.placeOrders();
        
        broker.showTransactionLog();
    }
}
