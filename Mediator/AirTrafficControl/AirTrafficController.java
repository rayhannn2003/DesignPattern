package Mediator.AirTrafficControl;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements AirTrafficControlMediator {
    private List<Aircraft> aircrafts;
    private boolean runwayAvailable;
    
    public AirTrafficController() {
        this.aircrafts = new ArrayList<>();
        this.runwayAvailable = true;
    }
    
    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
        System.out.println("ATC: " + aircraft.getName() + " registered");
    }
    
    @Override
    public void requestLanding(Aircraft aircraft) {
        if (runwayAvailable) {
            runwayAvailable = false;
            System.out.println("ATC: " + aircraft.getName() + " cleared for landing");
            notifyOthers("Runway occupied by " + aircraft.getName() + " for landing", aircraft);
        } else {
            System.out.println("ATC: " + aircraft.getName() + " please hold, runway busy");
        }
    }
    
    @Override
    public void requestTakeoff(Aircraft aircraft) {
        if (runwayAvailable) {
            runwayAvailable = false;
            System.out.println("ATC: " + aircraft.getName() + " cleared for takeoff");
            notifyOthers("Runway occupied by " + aircraft.getName() + " for takeoff", aircraft);
        } else {
            System.out.println("ATC: " + aircraft.getName() + " please hold, runway busy");
        }
    }
    
    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        System.out.println(aircraft.getName() + ": " + message);
    }
    
    public void releaseRunway() {
        runwayAvailable = true;
        System.out.println("ATC: Runway is now available");
    }
    
    private void notifyOthers(String message, Aircraft excludeAircraft) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft != excludeAircraft) {
                aircraft.receiveMessage("ATC: " + message);
            }
        }
    }
}
