package Mediator.AirTrafficControl;

public class Helicopter extends Aircraft {
    
    public Helicopter(AirTrafficControlMediator mediator, String name) {
        super(mediator, name);
    }
    
    @Override
    public void requestLanding() {
        mediator.sendMessage("Helicopter requesting landing", this);
        mediator.requestLanding(this);
    }
    
    @Override
    public void requestTakeoff() {
        mediator.sendMessage("Helicopter requesting takeoff", this);
        mediator.requestTakeoff(this);
    }
}
