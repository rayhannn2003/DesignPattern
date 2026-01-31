package Template.DocumentGenerator;

public class WordDocument extends DocumentGenerator {
    
    @Override
    protected void createHeader() {
        System.out.println("Creating Word header with styles");
    }
    
    @Override
    protected void addContent(String content) {
        System.out.println("Adding content to Word document: " + content);
        System.out.println("Formatting with XML structure");
    }
    
    @Override
    protected void createFooter() {
        System.out.println("Creating Word footer with document info");
    }
    
    @Override
    protected void saveFile() {
        System.out.println("Saving as .docx file");
    }
}
