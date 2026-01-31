package Command.GraphicsEditor;

public class GraphicsEditorDemo {
    public static void main(String[] args) {
        System.out.println("=== Graphics Editor with Multi-Level Undo ===\n");
        
        Canvas canvas = new Canvas();
        EditorHistory history = new EditorHistory();
        
        System.out.println("--- Drawing shapes ---");
        Shape circle = new Shape("Circle", 10, 10, "Red");
        Shape rectangle = new Shape("Rectangle", 50, 50, "Blue");
        
        history.executeCommand(new DrawShapeCommand(canvas, circle));
        history.executeCommand(new DrawShapeCommand(canvas, rectangle));
        
        System.out.println();
        canvas.display();
        
        System.out.println("\n--- Moving circle ---");
        history.executeCommand(new MoveShapeCommand(circle, 20, 30));
        
        System.out.println("\n--- Changing rectangle color ---");
        history.executeCommand(new ChangeColorCommand(rectangle, "Green"));
        
        System.out.println();
        canvas.display();
        
        System.out.println("\n--- Undo color change ---");
        history.undo();
        
        System.out.println("\n--- Undo move ---");
        history.undo();
        
        System.out.println();
        canvas.display();
        
        System.out.println("\n--- Redo move ---");
        history.redo();
        
        System.out.println("\n--- Redo color change ---");
        history.redo();
        
        System.out.println();
        canvas.display();
        
        System.out.println("\n--- Draw new shape ---");
        Shape triangle = new Shape("Triangle", 100, 100, "Yellow");
        history.executeCommand(new DrawShapeCommand(canvas, triangle));
        
        System.out.println("\n--- Try redo (should fail) ---");
        history.redo();
        
        System.out.println();
        canvas.display();
    }
}
