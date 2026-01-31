package Mediator.AirTrafficControl;

public abstract class Aircraft {
    protected AirTrafficControlMediator mediator;
    protected String name;
    
    public Aircraft(AirTrafficControlMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void requestLanding();
    
    public abstract void requestTakeoff();
    
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
