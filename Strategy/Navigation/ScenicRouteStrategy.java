package Strategy.Navigation;

public class ScenicRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating SCENIC route");
        System.out.println("From: " + start + " → To: " + destination);
        System.out.println("  - Distance: 45 km");
        System.out.println("  - Estimated time: 70 min");
        System.out.println("  - Route: Coastal Road → Mountain Pass → Lake View");
        System.out.println("  - Highlights: Ocean views, Mountain scenery");
    }
}
