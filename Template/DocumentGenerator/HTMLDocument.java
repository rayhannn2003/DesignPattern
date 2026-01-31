package Template.DocumentGenerator;

public class HTMLDocument extends DocumentGenerator {
    
    @Override
    protected void createHeader() {
        System.out.println("Creating HTML header: <!DOCTYPE html><html><head>");
    }
    
    @Override
    protected void addContent(String content) {
        System.out.println("Adding content to HTML body: <body>" + content + "</body>");
    }
    
    @Override
    protected void createFooter() {
        System.out.println("Creating HTML footer: </html>");
    }
    
    @Override
    protected void saveFile() {
        System.out.println("Saving as .html file");
    }
}
