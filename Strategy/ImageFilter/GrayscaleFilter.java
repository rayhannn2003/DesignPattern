package Strategy.ImageFilter;

public class GrayscaleFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Applying GRAYSCALE filter to " + imageName);
        System.out.println("  - Converting to black and white");
        System.out.println("  - Processing pixels...");
        System.out.println("  - Filter applied successfully");
    }
}
