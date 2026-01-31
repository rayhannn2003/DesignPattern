package Template.DocumentGenerator;

public class DocumentGeneratorDemo {
    public static void main(String[] args) {
        System.out.println("=== Document Generator Template Pattern ===\n");
        
        String content = "Lorem ipsum dolor sit amet";
        
        System.out.println("--- Generating PDF Document ---");
        DocumentGenerator pdf = new PDFDocument();
        pdf.generateDocument(content);
        
        System.out.println("\n--- Generating HTML Document ---");
        DocumentGenerator html = new HTMLDocument();
        html.generateDocument(content);
        
        System.out.println("\n--- Generating Word Document ---");
        DocumentGenerator word = new WordDocument();
        word.generateDocument(content);
    }
}
