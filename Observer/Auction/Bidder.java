package Observer.Auction;

public class Bidder implements Observer {
    private String name;
    
    public Bidder(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String itemName, double currentBid, String bidderName) {
        if (bidderName.equals(name)) {
            System.out.println(name + " -> You are currently the highest bidder!");
        } else if (!bidderName.equals("None")) {
            System.out.println(name + " -> " + bidderName + " bid $" + currentBid + " for " + itemName);
        }
    }
    
    public String getName() {
        return name;
    }
}
