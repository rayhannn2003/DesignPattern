package Strategy.Navigation;

public class NavigationApp {
    private RouteStrategy strategy;
    
    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void navigate(String start, String destination) {
        if (strategy == null) {
            System.out.println("Please select a route preference");
            return;
        }
        strategy.calculateRoute(start, destination);
    }
}
