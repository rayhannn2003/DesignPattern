package Template.DocumentGenerator;

public class PDFDocument extends DocumentGenerator {
    
    @Override
    protected void createHeader() {
        System.out.println("Creating PDF header with metadata");
    }
    
    @Override
    protected void addContent(String content) {
        System.out.println("Adding content to PDF: " + content);
        System.out.println("Encoding in binary format");
    }
    
    @Override
    protected void createFooter() {
        System.out.println("Creating PDF footer with page numbers");
    }
    
    @Override
    protected void saveFile() {
        System.out.println("Saving as .pdf file");
    }
}
