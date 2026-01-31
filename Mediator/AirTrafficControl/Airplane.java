package Mediator.AirTrafficControl;

public class Airplane extends Aircraft {
    
    public Airplane(AirTrafficControlMediator mediator, String name) {
        super(mediator, name);
    }
    
    @Override
    public void requestLanding() {
        mediator.sendMessage("Requesting landing permission", this);
        mediator.requestLanding(this);
    }
    
    @Override
    public void requestTakeoff() {
        mediator.sendMessage("Requesting takeoff clearance", this);
        mediator.requestTakeoff(this);
    }
}
