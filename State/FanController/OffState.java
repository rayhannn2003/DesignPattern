package State.FanController;

public class OffState implements FanState {
    
    @Override
    public void pressButton(Fan fan) {
        System.out.println("Turning on: Low speed");
        fan.setState(new LowState());
    }
    
    @Override
    public String getStateName() {
        return "OFF";
    }
    
    @Override
    public int getSpeed() {
        return 0;
    }
}
