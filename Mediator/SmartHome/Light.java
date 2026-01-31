package Mediator.SmartHome;

public class Light extends SmartDevice {
    private boolean isOn;
    private int brightness;
    
    public Light(SmartHomeMediator mediator, String name) {
        super(mediator, name);
        this.isOn = false;
        this.brightness = 100;
    }
    
    public void turnOn() {
        isOn = true;
        brightness = 100;
        System.out.println(name + ": Turned ON (100% brightness)");
    }
    
    public void turnOff() {
        isOn = false;
        System.out.println(name + ": Turned OFF");
    }
    
    public void dim() {
        isOn = true;
        brightness = 30;
        System.out.println(name + ": Dimmed to 30%");
    }
}
