package Mediator.StockExchange;

public abstract class Trader {
    protected StockMediator mediator;
    protected String name;
    
    public Trader(StockMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void buyStock(String stockSymbol, int quantity, double price);
    
    public abstract void sellStock(String stockSymbol, int quantity, double price);
    
    public void notifyTrade(String stockSymbol, int quantity, double price, String action) {
        System.out.println("→ " + name + " notification: " + action + " " + quantity + " shares of " + stockSymbol + " at $" + price);
    }
}
