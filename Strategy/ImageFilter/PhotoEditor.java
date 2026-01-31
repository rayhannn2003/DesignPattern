package Strategy.ImageFilter;

public class PhotoEditor {
    private FilterStrategy filterStrategy;
    
    public void setFilter(FilterStrategy strategy) {
        this.filterStrategy = strategy;
    }
    
    public void processImage(String imageName) {
        if (filterStrategy == null) {
            System.out.println("No filter selected");
            return;
        }
        filterStrategy.applyFilter(imageName);
    }
}
