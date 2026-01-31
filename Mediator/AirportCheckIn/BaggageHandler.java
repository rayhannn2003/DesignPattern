package Mediator.AirportCheckIn;

public class BaggageHandler {
    private CheckInMediator mediator;
    
    public BaggageHandler(CheckInMediator mediator) {
        this.mediator = mediator;
    }
    
    public void tagBaggage(String passengerName) {
        System.out.println("Baggage Handler: Tagging baggage for " + passengerName);
        System.out.println("Baggage Handler: ✓ Baggage tagged - Weight: 20kg");
    }
}
