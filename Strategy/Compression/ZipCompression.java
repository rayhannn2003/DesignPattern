package Strategy.Compression;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using ZIP format");
        System.out.println("  - Algorithm: DEFLATE");
        System.out.println("  - Compression ratio: 70%");
        System.out.println("  - Speed: Fast");
        System.out.println("  - Output: " + fileName + ".zip");
    }
}
