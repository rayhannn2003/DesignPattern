package Mediator.AirportCheckIn;

public class CheckInCoordinator implements CheckInMediator {
    private TicketCounter ticketCounter;
    private BaggageHandler baggageHandler;
    private SecurityCheck securityCheck;
    private GateAssignment gateAssignment;
    
    public CheckInCoordinator() {
        this.ticketCounter = new TicketCounter(this);
        this.baggageHandler = new BaggageHandler(this);
        this.securityCheck = new SecurityCheck(this);
        this.gateAssignment = new GateAssignment(this);
    }
    
    @Override
    public void checkInPassenger(String passengerName, Passenger passenger) {
        System.out.println("\n=== Check-in process for " + passengerName + " ===");
        
        ticketCounter.verifyTicket(passengerName);
        
        if (passenger.hasBaggage()) {
            baggageHandler.tagBaggage(passengerName);
        }
        
        securityCheck.issueSecurityPass(passengerName);
        
        String gate = gateAssignment.assignGate(passengerName);
        
        System.out.println("✓ Check-in complete for " + passengerName + " - Gate: " + gate);
    }
}
