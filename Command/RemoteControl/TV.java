package Command.RemoteControl;

public class TV {
    private String location;
    private boolean isOn;
    
    public TV(String location) {
        this.location = location;
        this.isOn = false;
    }
    
    public void on() {
        isOn = true;
        System.out.println(location + " TV is ON");
    }
    
    public void off() {
        isOn = false;
        System.out.println(location + " TV is OFF");
    }
    
    public void setVolume(int level) {
        System.out.println(location + " TV volume set to " + level);
    }
}
