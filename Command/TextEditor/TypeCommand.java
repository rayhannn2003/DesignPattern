package Command.TextEditor;

public class TypeCommand implements Command {
    private TextEditor editor;
    private String text;
    private int previousCursor;
    
    public TypeCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }
    
    @Override
    public void execute() {
        previousCursor = editor.getCursorPosition();
        editor.type(text);
        System.out.println("Typed: \"" + text + "\"");
    }
    
    @Override
    public void undo() {
        editor.delete(text.length());
        editor.moveCursor(previousCursor);
        System.out.println("Undo type: \"" + text + "\"");
    }
}
