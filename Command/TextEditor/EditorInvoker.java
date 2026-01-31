package Command.TextEditor;

import java.util.Stack;

public class EditorInvoker {
    private Stack<Command> history;
    private Stack<Command> redoStack;
    
    public EditorInvoker() {
        this.history = new Stack<>();
        this.redoStack = new Stack<>();
    }
    
    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        redoStack.clear();
    }
    
    public void undo() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        Command command = history.pop();
        command.undo();
        redoStack.push(command);
    }
    
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }
        Command command = redoStack.pop();
        command.execute();
        history.push(command);
    }
}
