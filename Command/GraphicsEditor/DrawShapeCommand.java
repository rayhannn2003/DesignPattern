package Command.GraphicsEditor;

public class DrawShapeCommand implements Command {
    private Canvas canvas;
    private Shape shape;
    
    public DrawShapeCommand(Canvas canvas, Shape shape) {
        this.canvas = canvas;
        this.shape = shape;
    }
    
    @Override
    public void execute() {
        canvas.addShape(shape);
    }
    
    @Override
    public void undo() {
        canvas.removeShape(shape);
    }
}
