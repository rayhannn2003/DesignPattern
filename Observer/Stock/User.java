package Observer.Stock;
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " has been notified: The price of " + stockName + " is now " + price);
    }

    public void followStock(Stock stock) {
        stock.attach(this);
    }

    public void unfollowStock(Stock stock) {
        stock.detach(this);
    }
}
