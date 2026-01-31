package Mediator.AirportCheckIn;

public class TicketCounter {
    private CheckInMediator mediator;
    
    public TicketCounter(CheckInMediator mediator) {
        this.mediator = mediator;
    }
    
    public void verifyTicket(String passengerName) {
        System.out.println("Ticket Counter: Verifying ticket for " + passengerName);
        System.out.println("Ticket Counter: ✓ Ticket verified");
    }
}
