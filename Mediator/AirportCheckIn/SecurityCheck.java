package Mediator.AirportCheckIn;

public class SecurityCheck {
    private CheckInMediator mediator;
    
    public SecurityCheck(CheckInMediator mediator) {
        this.mediator = mediator;
    }
    
    public void issueSecurityPass(String passengerName) {
        System.out.println("Security: Processing security clearance for " + passengerName);
        System.out.println("Security: ✓ Security pass issued");
    }
}
