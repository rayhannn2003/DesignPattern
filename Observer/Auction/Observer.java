package Observer.Auction;

public interface Observer {
    void update(String itemName, double currentBid, String bidderName);
}
