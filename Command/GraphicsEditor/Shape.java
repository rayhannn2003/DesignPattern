package Command.GraphicsEditor;

public class Shape {
    private String type;
    private int x;
    private int y;
    private String color;
    
    public Shape(String type, int x, int y, String color) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
    
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return type + " at (" + x + "," + y + ") color: " + color;
    }
}
