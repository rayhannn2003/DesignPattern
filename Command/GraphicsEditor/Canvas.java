package Command.GraphicsEditor;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Shape> shapes;
    
    public Canvas() {
        this.shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
        System.out.println("Added " + shape);
    }
    
    public void removeShape(Shape shape) {
        shapes.remove(shape);
        System.out.println("Removed " + shape);
    }
    
    public void display() {
        System.out.println("Canvas contains:");
        for (Shape shape : shapes) {
            System.out.println("  - " + shape);
        }
    }
}
