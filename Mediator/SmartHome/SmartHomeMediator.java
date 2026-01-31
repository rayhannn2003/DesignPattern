package Mediator.SmartHome;

public interface SmartHomeMediator {
    void registerDevice(SmartDevice device);
    void notify(String event, SmartDevice device);
}
