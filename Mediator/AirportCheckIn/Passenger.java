package Mediator.AirportCheckIn;

public class Passenger {
    private String name;
    private boolean hasBaggage;
    
    public Passenger(String name, boolean hasBaggage) {
        this.name = name;
        this.hasBaggage = hasBaggage;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean hasBaggage() {
        return hasBaggage;
    }
    
    public void checkIn(CheckInMediator mediator) {
        mediator.checkInPassenger(name, this);
    }
}
