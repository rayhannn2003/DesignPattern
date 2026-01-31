package Command.GraphicsEditor;

public class ChangeColorCommand implements Command {
    private Shape shape;
    private String oldColor;
    private String newColor;
    
    public ChangeColorCommand(Shape shape, String newColor) {
        this.shape = shape;
        this.oldColor = shape.getColor();
        this.newColor = newColor;
    }
    
    @Override
    public void execute() {
        shape.changeColor(newColor);
        System.out.println("Changed " + shape.getType() + " color from " + oldColor + " to " + newColor);
    }
    
    @Override
    public void undo() {
        shape.changeColor(oldColor);
        System.out.println("Undo color change: " + shape.getType() + " back to " + oldColor);
    }
}
