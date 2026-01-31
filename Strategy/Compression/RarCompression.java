package Strategy.Compression;

public class RarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using RAR format");
        System.out.println("  - Algorithm: RAR5");
        System.out.println("  - Compression ratio: 85%");
        System.out.println("  - Speed: Medium");
        System.out.println("  - Output: " + fileName + ".rar");
    }
}
