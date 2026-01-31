package Mediator.SmartHome;

public class DoorLock extends SmartDevice {
    private boolean locked;
    
    public DoorLock(SmartHomeMediator mediator, String name) {
        super(mediator, name);
        this.locked = true;
    }
    
    public void open() {
        locked = false;
        System.out.println(name + ": Door unlocked and opened");
        mediator.notify("DOOR_OPENED", this);
    }
    
    public void lock() {
        locked = true;
        System.out.println(name + ": Door locked");
    }
}
