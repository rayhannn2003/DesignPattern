package Command.GraphicsEditor;

public class MoveShapeCommand implements Command {
    private Shape shape;
    private int oldX;
    private int oldY;
    private int newX;
    private int newY;
    
    public MoveShapeCommand(Shape shape, int newX, int newY) {
        this.shape = shape;
        this.oldX = shape.getX();
        this.oldY = shape.getY();
        this.newX = newX;
        this.newY = newY;
    }
    
    @Override
    public void execute() {
        shape.move(newX, newY);
        System.out.println("Moved " + shape.getType() + " from (" + oldX + "," + oldY + ") to (" + newX + "," + newY + ")");
    }
    
    @Override
    public void undo() {
        shape.move(oldX, oldY);
        System.out.println("Undo move: " + shape.getType() + " back to (" + oldX + "," + oldY + ")");
    }
}
