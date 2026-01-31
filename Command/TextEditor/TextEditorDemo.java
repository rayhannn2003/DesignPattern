package Command.TextEditor;

public class TextEditorDemo {
    public static void main(String[] args) {
        System.out.println("=== Text Editor with Undo/Redo ===\n");
        
        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();
        
        System.out.println("--- Typing text ---");
        invoker.executeCommand(new TypeCommand(editor, "Hello "));
        editor.display();
        
        invoker.executeCommand(new TypeCommand(editor, "World"));
        editor.display();
        
        invoker.executeCommand(new TypeCommand(editor, "!"));
        editor.display();
        
        System.out.println("\n--- Deleting text ---");
        invoker.executeCommand(new DeleteCommand(editor, 6));
        editor.display();
        
        System.out.println("\n--- Undo operations ---");
        invoker.undo();
        editor.display();
        
        invoker.undo();
        editor.display();
        
        System.out.println("\n--- Redo operations ---");
        invoker.redo();
        editor.display();
        
        invoker.redo();
        editor.display();
        
        System.out.println("\n--- More typing ---");
        invoker.executeCommand(new TypeCommand(editor, " Java"));
        editor.display();
        
        System.out.println("\n--- Try redo (should fail - new command cleared redo stack) ---");
        invoker.redo();
    }
}
