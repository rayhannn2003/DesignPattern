package State.FanController;

public class HighState implements FanState {
    
    @Override
    public void pressButton(Fan fan) {
        System.out.println("Turning off");
        fan.setState(new OffState());
    }
    
    @Override
    public String getStateName() {
        return "HIGH";
    }
    
    @Override
    public int getSpeed() {
        return 3;
    }
}
