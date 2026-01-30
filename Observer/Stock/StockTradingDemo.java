package Observer.Stock;
public class StockTradingDemo {
    public static void main(String[] args) {
        Stock googleStock = new Stock("Google", 1500);
        Stock appleStock = new Stock("Apple", 1200);

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.followStock(googleStock);
        user2.followStock(googleStock);
        user1.followStock(appleStock);

        System.out.println("Updating Google stock price...");
        googleStock.setPrice(1550);

        System.out.println("\nUpdating Apple stock price...");
        appleStock.setPrice(1250);

        user1.unfollowStock(googleStock);

        System.out.println("\nUpdating Google stock price again...");
        googleStock.setPrice(1600);
    }
}
