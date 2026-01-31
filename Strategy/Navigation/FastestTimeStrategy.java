package Strategy.Navigation;

public class FastestTimeStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating FASTEST TIME route");
        System.out.println("From: " + start + " → To: " + destination);
        System.out.println("  - Distance: 32 km");
        System.out.println("  - Estimated time: 28 min");
        System.out.println("  - Route: Express Highway → Bypass Road");
        System.out.println("  - Traffic considered: Light traffic");
    }
}
