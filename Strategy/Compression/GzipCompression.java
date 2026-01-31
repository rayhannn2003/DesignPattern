package Strategy.Compression;

public class GzipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using GZIP format");
        System.out.println("  - Algorithm: GZIP");
        System.out.println("  - Compression ratio: 65%");
        System.out.println("  - Speed: Very Fast");
        System.out.println("  - Output: " + fileName + ".gz");
    }
}
