package Strategy.ImageFilter;

public class SharpenFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Applying SHARPEN filter to " + imageName);
        System.out.println("  - Enhancing edges");
        System.out.println("  - Increasing clarity");
        System.out.println("  - Filter applied successfully");
    }
}
