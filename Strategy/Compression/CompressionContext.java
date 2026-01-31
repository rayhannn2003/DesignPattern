package Strategy.Compression;

public class CompressionContext {
    private CompressionStrategy strategy;
    
    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void compressFile(String fileName) {
        if (strategy == null) {
            System.out.println("Please select a compression format");
            return;
        }
        strategy.compress(fileName);
    }
}
