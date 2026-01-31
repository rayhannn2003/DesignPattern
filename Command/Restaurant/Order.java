package Command.Restaurant;

public interface Order {
    void execute();
    void cancel();
    String getOrderDetails();
}
