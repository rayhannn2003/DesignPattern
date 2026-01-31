package Strategy.ImageFilter;

public class BlurFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Applying BLUR filter to " + imageName);
        System.out.println("  - Gaussian blur algorithm");
        System.out.println("  - Radius: 5px");
        System.out.println("  - Filter applied successfully");
    }
}
