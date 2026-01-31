package Strategy.Navigation;

public class ShortestDistanceStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating SHORTEST DISTANCE route");
        System.out.println("From: " + start + " → To: " + destination);
        System.out.println("  - Distance: 25 km");
        System.out.println("  - Estimated time: 45 min");
        System.out.println("  - Route: Highway 101 → Main Street");
    }
}
