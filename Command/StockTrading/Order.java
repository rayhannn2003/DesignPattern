package Command.StockTrading;

public interface Order {
    void execute();
    void cancel();
    String getOrderDetails();
}
