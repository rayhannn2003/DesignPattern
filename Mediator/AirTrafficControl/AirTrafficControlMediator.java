package Mediator.AirTrafficControl;

public interface AirTrafficControlMediator {
    void registerAircraft(Aircraft aircraft);
    void requestLanding(Aircraft aircraft);
    void requestTakeoff(Aircraft aircraft);
    void sendMessage(String message, Aircraft aircraft);
}
