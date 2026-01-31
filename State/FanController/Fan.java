package State.FanController;

public class Fan {
    private FanState state;
    
    public Fan() {
        this.state = new OffState();
        System.out.println("Fan initialized: " + state.getStateName());
    }
    
    public void setState(FanState state) {
        this.state = state;
        displayStatus();
    }
    
    public void pressButton() {
        state.pressButton(this);
    }
    
    public void displayStatus() {
        System.out.println("→ Fan Speed: " + state.getStateName() + " (Level " + state.getSpeed() + ")");
    }
}
