package Strategy.Navigation;

public class AvoidTollsStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating AVOID TOLLS route");
        System.out.println("From: " + start + " → To: " + destination);
        System.out.println("  - Distance: 38 km");
        System.out.println("  - Estimated time: 55 min");
        System.out.println("  - Route: Local roads → State Highway");
        System.out.println("  - Toll savings: $5.50");
    }
}
