package Strategy.ImageFilter;

public class ImageFilterDemo {
    public static void main(String[] args) {
        System.out.println("=== Photo Editing Application ===\n");
        
        PhotoEditor editor = new PhotoEditor();
        String image = "portrait.jpg";
        
        System.out.println("--- Converting to black and white ---");
        editor.setFilter(new GrayscaleFilter());
        editor.processImage(image);
        
        System.out.println("\n--- Creating vintage look ---");
        editor.setFilter(new SepiaFilter());
        editor.processImage(image);
        
        System.out.println("\n--- Softening portrait ---");
        editor.setFilter(new BlurFilter());
        editor.processImage(image);
        
        System.out.println("\n--- Enhancing details ---");
        editor.setFilter(new SharpenFilter());
        editor.processImage(image);
        
        System.out.println("\n--- Applying vintage effect ---");
        editor.setFilter(new VintageFilter());
        editor.processImage(image);
        
        System.out.println("\n--- Processing landscape with different filter ---");
        String landscape = "landscape.jpg";
        editor.setFilter(new SharpenFilter());
        editor.processImage(landscape);
    }
}
