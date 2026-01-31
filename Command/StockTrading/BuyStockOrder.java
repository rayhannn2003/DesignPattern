package Command.StockTrading;

public class BuyStockOrder implements Order {
    private Stock stock;
    private int quantity;
    
    public BuyStockOrder(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }
    
    @Override
    public void execute() {
        stock.buy(quantity);
    }
    
    @Override
    public void cancel() {
        System.out.println("Buy order cancelled: " + quantity + " shares of " + stock.getName());
    }
    
    @Override
    public String getOrderDetails() {
        return "BUY " + quantity + " shares of " + stock.getName() + " at $" + stock.getPrice();
    }
}
