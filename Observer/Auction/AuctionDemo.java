package Observer.Auction;

public class AuctionDemo {
    public static void main(String[] args) {
        System.out.println("=== Online Auction System ===\n");
        
        Auction auction = new Auction("Vintage Rolex Watch", 1000);
        
        Bidder alice = new Bidder("Alice");
        Bidder bob = new Bidder("Bob");
        Bidder charlie = new Bidder("Charlie");
        
        System.out.println("--- Bidders joining auction ---");
        auction.attach(alice);
        auction.attach(bob);
        auction.attach(charlie);
        
        System.out.println("\n--- Bidding begins ---");
        auction.placeBid("Alice", 1200);
        
        auction.placeBid("Bob", 1500);
        
        auction.placeBid("Charlie", 1400);
        
        auction.placeBid("Alice", 1800);
        
        Bidder david = new Bidder("David");
        System.out.println("\n--- Late bidder joins ---");
        auction.attach(david);
        
        auction.placeBid("David", 2000);
        
        auction.placeBid("Bob", 2500);
        
        auction.closeAuction();
    }
}
