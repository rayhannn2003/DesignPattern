package State.FanController;

public class MediumState implements FanState {
    
    @Override
    public void pressButton(Fan fan) {
        System.out.println("Increasing to: High speed");
        fan.setState(new HighState());
    }
    
    @Override
    public String getStateName() {
        return "MEDIUM";
    }
    
    @Override
    public int getSpeed() {
        return 2;
    }
}
