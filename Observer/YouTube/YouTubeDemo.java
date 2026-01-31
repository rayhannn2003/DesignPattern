package Observer.YouTube;

public class YouTubeDemo {
    public static void main(String[] args) {
        System.out.println("=== YouTube Notification System ===\n");
        
        YouTubeChannel techChannel = new YouTubeChannel("Tech Guru");
        YouTubeChannel cookingChannel = new YouTubeChannel("Master Chef");
        
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");
        
        System.out.println("--- Users subscribing to channels ---");
        techChannel.subscribe(alice);
        techChannel.subscribe(bob);
        techChannel.subscribe(charlie);
        
        cookingChannel.subscribe(alice);
        cookingChannel.subscribe(bob);
        
        System.out.println("\n--- Tech Guru uploads new video ---");
        techChannel.uploadVideo("Top 10 Programming Languages in 2026");
        
        System.out.println("\n--- Bob disables notifications ---");
        bob.disableNotifications();
        
        System.out.println("\n--- Master Chef uploads new video ---");
        cookingChannel.uploadVideo("Perfect Pasta Carbonara Recipe");
        
        System.out.println("\n--- Charlie unsubscribes from Tech Guru ---");
        techChannel.unsubscribe(charlie);
        
        System.out.println("\n--- Tech Guru uploads another video ---");
        techChannel.uploadVideo("AI Revolution: What's Next?");
        
        System.out.println("\n--- Bob enables notifications ---");
        bob.enableNotifications();
        
        System.out.println("\n--- Master Chef uploads new video ---");
        cookingChannel.uploadVideo("5-Minute Breakfast Ideas");
    }
}
