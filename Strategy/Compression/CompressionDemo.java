package Strategy.Compression;

public class CompressionDemo {
    public static void main(String[] args) {
        System.out.println("=== File Compression Utility ===\n");
        
        CompressionContext context = new CompressionContext();
        
        System.out.println("--- Compressing small document ---");
        context.setStrategy(new ZipCompression());
        context.compressFile("report.pdf");
        
        System.out.println("\n--- Compressing large media file ---");
        context.setStrategy(new RarCompression());
        context.compressFile("video.mp4");
        
        System.out.println("\n--- Compressing log file (speed priority) ---");
        context.setStrategy(new GzipCompression());
        context.compressFile("server.log");
        
        System.out.println("\n--- Creating archive for backup ---");
        context.setStrategy(new TarCompression());
        context.compressFile("backup_data");
        
        System.out.println("\n--- Switching compression format ---");
        System.out.println("User changes preference to RAR:");
        context.setStrategy(new RarCompression());
        context.compressFile("project.zip");
    }
}
