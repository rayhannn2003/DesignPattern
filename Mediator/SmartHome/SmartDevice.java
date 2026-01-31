package Mediator.SmartHome;

public abstract class SmartDevice {
    protected SmartHomeMediator mediator;
    protected String name;
    
    public SmartDevice(SmartHomeMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
