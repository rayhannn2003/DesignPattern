package Command.TextEditor;

public class TextEditor {
    private StringBuilder content;
    private int cursorPosition;
    
    public TextEditor() {
        this.content = new StringBuilder();
        this.cursorPosition = 0;
    }
    
    public void type(String text) {
        content.insert(cursorPosition, text);
        cursorPosition += text.length();
    }
    
    public String delete(int length) {
        if (cursorPosition < length) {
            length = cursorPosition;
        }
        int startPos = cursorPosition - length;
        String deleted = content.substring(startPos, cursorPosition);
        content.delete(startPos, cursorPosition);
        cursorPosition = startPos;
        return deleted;
    }
    
    public void moveCursor(int position) {
        this.cursorPosition = position;
    }
    
    public int getCursorPosition() {
        return cursorPosition;
    }
    
    public String getContent() {
        return content.toString();
    }
    
    public void display() {
        System.out.println("Content: " + content.toString());
        System.out.println("Cursor at position: " + cursorPosition);
    }
}
