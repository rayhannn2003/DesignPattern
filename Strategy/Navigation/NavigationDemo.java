package Strategy.Navigation;

public class NavigationDemo {
    public static void main(String[] args) {
        System.out.println("=== GPS Navigation System ===\n");
        
        NavigationApp app = new NavigationApp();
        String start = "Downtown";
        String destination = "Airport";
        
        System.out.println("--- User prefers shortest distance ---");
        app.setRouteStrategy(new ShortestDistanceStrategy());
        app.navigate(start, destination);
        
        System.out.println("\n--- User is in a hurry (fastest time) ---");
        app.setRouteStrategy(new FastestTimeStrategy());
        app.navigate(start, destination);
        
        System.out.println("\n--- User wants to save money (avoid tolls) ---");
        app.setRouteStrategy(new AvoidTollsStrategy());
        app.navigate(start, destination);
        
        System.out.println("\n--- User has time and wants scenic route ---");
        app.setRouteStrategy(new ScenicRouteStrategy());
        app.navigate(start, destination);
        
        System.out.println("\n--- Traffic alert! Switching to fastest time ---");
        app.setRouteStrategy(new FastestTimeStrategy());
        app.navigate(start, destination);
    }
}
