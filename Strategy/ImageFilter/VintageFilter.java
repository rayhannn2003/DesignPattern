package Strategy.ImageFilter;

public class VintageFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Applying VINTAGE filter to " + imageName);
        System.out.println("  - Adding light leaks");
        System.out.println("  - Adjusting contrast");
        System.out.println("  - Adding vignette effect");
        System.out.println("  - Filter applied successfully");
    }
}
