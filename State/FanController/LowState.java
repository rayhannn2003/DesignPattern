package State.FanController;

public class LowState implements FanState {
    
    @Override
    public void pressButton(Fan fan) {
        System.out.println("Increasing to: Medium speed");
        fan.setState(new MediumState());
    }
    
    @Override
    public String getStateName() {
        return "LOW";
    }
    
    @Override
    public int getSpeed() {
        return 1;
    }
}
