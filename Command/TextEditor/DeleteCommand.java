package Command.TextEditor;

public class DeleteCommand implements Command {
    private TextEditor editor;
    private int length;
    private String deletedText;
    private int previousCursor;
    
    public DeleteCommand(TextEditor editor, int length) {
        this.editor = editor;
        this.length = length;
    }
    
    @Override
    public void execute() {
        previousCursor = editor.getCursorPosition();
        deletedText = editor.delete(length);
        System.out.println("Deleted: \"" + deletedText + "\"");
    }
    
    @Override
    public void undo() {
        editor.type(deletedText);
        editor.moveCursor(previousCursor);
        System.out.println("Undo delete: restored \"" + deletedText + "\"");
    }
}
