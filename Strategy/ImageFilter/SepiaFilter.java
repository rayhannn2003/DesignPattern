package Strategy.ImageFilter;

public class SepiaFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Applying SEPIA filter to " + imageName);
        System.out.println("  - Adding warm brown tones");
        System.out.println("  - Creating vintage look");
        System.out.println("  - Filter applied successfully");
    }
}
