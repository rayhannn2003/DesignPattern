package Mediator.StockExchange;

public class Order {
    private String stockSymbol;
    private int quantity;
    private double price;
    private Trader trader;
    private String type;
    
    public Order(String stockSymbol, int quantity, double price, Trader trader, String type) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.trader = trader;
        this.type = type;
    }
    
    public String getStockSymbol() {
        return stockSymbol;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    public Trader getTrader() {
        return trader;
    }
    
    public String getType() {
        return type;
    }
}
