package Mediator.AirportCheckIn;

public class AirportCheckInDemo {
    public static void main(String[] args) {
        System.out.println("=== Airport Check-in Mediator Pattern ===");
        
        CheckInCoordinator coordinator = new CheckInCoordinator();
        
        Passenger john = new Passenger("John Smith", true);
        Passenger alice = new Passenger("Alice Johnson", false);
        Passenger bob = new Passenger("Bob Williams", true);
        
        john.checkIn(coordinator);
        alice.checkIn(coordinator);
        bob.checkIn(coordinator);
    }
}
