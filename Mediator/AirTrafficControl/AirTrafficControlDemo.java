package Mediator.AirTrafficControl;

public class AirTrafficControlDemo {
    public static void main(String[] args) {
        System.out.println("=== Air Traffic Control Mediator Pattern ===\n");
        
        AirTrafficController atc = new AirTrafficController();
        
        Aircraft flight101 = new Airplane(atc, "Flight-101");
        Aircraft flight202 = new Airplane(atc, "Flight-202");
        Aircraft heli1 = new Helicopter(atc, "Heli-1");
        
        atc.registerAircraft(flight101);
        atc.registerAircraft(flight202);
        atc.registerAircraft(heli1);
        
        System.out.println("\n--- Scenario 1: Landing Request ---");
        flight101.requestLanding();
        
        System.out.println("\n--- Scenario 2: Simultaneous Requests ---");
        flight202.requestLanding();
        heli1.requestLanding();
        
        System.out.println("\n--- Scenario 3: Runway Released ---");
        atc.releaseRunway();
        flight202.requestLanding();
        
        System.out.println("\n--- Scenario 4: Takeoff Request ---");
        atc.releaseRunway();
        heli1.requestTakeoff();
    }
}
