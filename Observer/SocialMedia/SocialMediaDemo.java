package Observer.SocialMedia;

public class SocialMediaDemo {
    public static void main(String[] args) {
        System.out.println("=== Social Media News Feed System ===\n");
        
        Celebrity elonMusk = new Celebrity("Elon Musk");
        Celebrity taylorSwift = new Celebrity("Taylor Swift");
        
        Follower alice = new Follower("Alice");
        Follower bob = new Follower("Bob");
        Follower charlie = new Follower("Charlie");
        
        System.out.println("--- Users following celebrities ---");
        elonMusk.addFollower(alice);
        elonMusk.addFollower(bob);
        elonMusk.addFollower(charlie);
        
        taylorSwift.addFollower(alice);
        taylorSwift.addFollower(charlie);
        
        System.out.println("\n--- Celebrity posts ---");
        elonMusk.post("Just launched Starship to Mars!");
        
        taylorSwift.post("New album dropping next week!");
        
        System.out.println("\n--- Bob unfollows Elon ---");
        elonMusk.removeFollower(bob);
        
        elonMusk.post("Tesla stock hits new high!");
        
        taylorSwift.post("Thank you for 100M followers!");
    }
}
