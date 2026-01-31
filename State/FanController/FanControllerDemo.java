package State.FanController;

public class FanControllerDemo {
    public static void main(String[] args) {
        System.out.println("=== Fan Controller Simulation ===\n");
        
        Fan fan = new Fan();
        
        System.out.println("\n--- Cycling through all speeds ---");
        fan.pressButton();  // Off → Low
        fan.pressButton();  // Low → Medium
        fan.pressButton();  // Medium → High
        fan.pressButton();  // High → Off (cycle complete)
        
        System.out.println("\n--- Another cycle ---");
        fan.pressButton();  // Off → Low
        fan.pressButton();  // Low → Medium
        fan.pressButton();  // Medium → High
        fan.pressButton();  // High → Off
        
        System.out.println("\n--- Quick toggle ---");
        fan.pressButton();  // Off → Low
        fan.pressButton();  // Low → Medium
        
        System.out.println("\nFan controller demonstrates circular state transitions!");
    }
}
