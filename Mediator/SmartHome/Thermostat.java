package Mediator.SmartHome;

public class Thermostat extends SmartDevice {
    private int temperature;
    
    public Thermostat(SmartHomeMediator mediator, String name) {
        super(mediator, name);
        this.temperature = 22;
    }
    
    public void detectHighTemperature() {
        System.out.println(name + ": Temperature too high (" + temperature + "°C)");
        mediator.notify("TEMPERATURE_HIGH", this);
    }
    
    public void decreaseTemperature() {
        temperature -= 3;
        System.out.println(name + ": Temperature decreased to " + temperature + "°C");
    }
    
    public void setNightMode() {
        temperature = 20;
        System.out.println(name + ": Night mode - Temperature set to " + temperature + "°C");
    }
}
