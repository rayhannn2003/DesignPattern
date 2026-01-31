package Command.StockTrading;

public class SellStockOrder implements Order {
    private Stock stock;
    private int quantity;
    
    public SellStockOrder(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }
    
    @Override
    public void execute() {
        stock.sell(quantity);
    }
    
    @Override
    public void cancel() {
        System.out.println("Sell order cancelled: " + quantity + " shares of " + stock.getName());
    }
    
    @Override
    public String getOrderDetails() {
        return "SELL " + quantity + " shares of " + stock.getName() + " at $" + stock.getPrice();
    }
}
