package Mediator.SmartHome;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements SmartHomeMediator {
    private List<SmartDevice> devices;
    
    public SmartHomeHub() {
        this.devices = new ArrayList<>();
        System.out.println("Smart Home Hub initialized");
    }
    
    @Override
    public void registerDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Device registered: " + device.getName());
    }
    
    @Override
    public void notify(String event, SmartDevice device) {
        System.out.println("\n[HUB] Event received: " + event + " from " + device.getName());
        
        if (event.equals("MOTION_DETECTED")) {
            handleMotionDetected();
        } else if (event.equals("TEMPERATURE_HIGH")) {
            handleHighTemperature();
        } else if (event.equals("DOOR_OPENED")) {
            handleDoorOpened();
        } else if (event.equals("NIGHT_MODE")) {
            handleNightMode();
        }
    }
    
    private void handleMotionDetected() {
        System.out.println("[HUB] Motion detected - Activating security protocol");
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                ((Light) device).turnOn();
            } else if (device instanceof SecurityCamera) {
                ((SecurityCamera) device).startRecording();
            }
        }
    }
    
    private void handleHighTemperature() {
        System.out.println("[HUB] High temperature - Cooling down");
        for (SmartDevice device : devices) {
            if (device instanceof Thermostat) {
                ((Thermostat) device).decreaseTemperature();
            }
        }
    }
    
    private void handleDoorOpened() {
        System.out.println("[HUB] Door opened - Security check");
        for (SmartDevice device : devices) {
            if (device instanceof SecurityCamera) {
                ((SecurityCamera) device).startRecording();
            }
        }
    }
    
    private void handleNightMode() {
        System.out.println("[HUB] Night mode activated");
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                ((Light) device).dim();
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setNightMode();
            }
        }
    }
}
