package Strategy.Compression;

public class TarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using TAR format");
        System.out.println("  - Algorithm: TAR Archive");
        System.out.println("  - Compression ratio: 60%");
        System.out.println("  - Speed: Fast");
        System.out.println("  - Output: " + fileName + ".tar");
    }
}
