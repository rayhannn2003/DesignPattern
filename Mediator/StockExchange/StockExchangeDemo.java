package Mediator.StockExchange;

public class StockExchangeDemo {
    public static void main(String[] args) {
        System.out.println("=== Stock Exchange Mediator Pattern ===\n");
        
        StockMediator exchange = new StockExchange();
        
        Trader alice = new StockTrader(exchange, "Alice");
        Trader bob = new StockTrader(exchange, "Bob");
        Trader charlie = new StockTrader(exchange, "Charlie");
        
        exchange.registerTrader(alice);
        exchange.registerTrader(bob);
        exchange.registerTrader(charlie);
        
        System.out.println("\n--- Trading Scenario ---");
        
        alice.sellStock("AAPL", 100, 150.0);
        bob.buyStock("AAPL", 50, 155.0);
        
        charlie.buyStock("GOOGL", 200, 2800.0);
        alice.sellStock("GOOGL", 150, 2750.0);
        
        bob.sellStock("TSLA", 75, 700.0);
        charlie.buyStock("TSLA", 100, 720.0);
    }
}
