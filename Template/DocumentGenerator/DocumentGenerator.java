package Template.DocumentGenerator;

public abstract class DocumentGenerator {
    
    public final void generateDocument(String content) {
        createHeader();
        addContent(content);
        createFooter();
        saveFile();
    }
    
    protected abstract void createHeader();
    
    protected abstract void addContent(String content);
    
    protected abstract void createFooter();
    
    protected abstract void saveFile();
}
