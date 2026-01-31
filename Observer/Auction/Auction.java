package Observer.Auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private String itemName;
    private double currentBid;
    private String currentBidder;
    private List<Observer> bidders;
    private boolean isActive;
    
    public Auction(String itemName, double startingPrice) {
        this.itemName = itemName;
        this.currentBid = startingPrice;
        this.currentBidder = "None";
        this.bidders = new ArrayList<>();
        this.isActive = true;
    }
    
    @Override
    public void attach(Observer observer) {
        bidders.add(observer);
        System.out.println("New bidder joined the auction");
    }
    
    @Override
    public void detach(Observer observer) {
        bidders.remove(observer);
        System.out.println("A bidder left the auction");
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : bidders) {
            observer.update(itemName, currentBid, currentBidder);
        }
    }
    
    public void placeBid(String bidderName, double amount) {
        if (!isActive) {
            System.out.println("Auction is closed!");
            return;
        }
        
        if (amount > currentBid) {
            currentBid = amount;
            currentBidder = bidderName;
            System.out.println("\n" + bidderName + " placed a bid of $" + amount);
            notifyObservers();
        } else {
            System.out.println("\nBid rejected! Amount must be higher than current bid of $" + currentBid);
        }
    }
    
    public void closeAuction() {
        isActive = false;
        System.out.println("\n=== AUCTION CLOSED ===");
        System.out.println("Winner: " + currentBidder + " with bid $" + currentBid);
        notifyObservers();
    }
}
