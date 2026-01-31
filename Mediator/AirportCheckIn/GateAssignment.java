package Mediator.AirportCheckIn;

public class GateAssignment {
    private CheckInMediator mediator;
    private int gateNumber;
    
    public GateAssignment(CheckInMediator mediator) {
        this.mediator = mediator;
        this.gateNumber = 1;
    }
    
    public String assignGate(String passengerName) {
        String gate = "A" + gateNumber;
        System.out.println("Gate Assignment: Assigning gate " + gate + " to " + passengerName);
        gateNumber++;
        return gate;
    }
}
