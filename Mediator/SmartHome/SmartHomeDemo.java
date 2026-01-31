package Mediator.SmartHome;

public class SmartHomeDemo {
    public static void main(String[] args) {
        System.out.println("=== Smart Home Automation Mediator Pattern ===\n");
        
        SmartHomeHub hub = new SmartHomeHub();
        
        Light livingRoomLight = new Light(hub, "Living Room Light");
        Thermostat thermostat = new Thermostat(hub, "Main Thermostat");
        SecurityCamera camera = new SecurityCamera(hub, "Front Door Camera");
        DoorLock frontDoor = new DoorLock(hub, "Front Door Lock");
        
        hub.registerDevice(livingRoomLight);
        hub.registerDevice(thermostat);
        hub.registerDevice(camera);
        hub.registerDevice(frontDoor);
        
        System.out.println("\n--- Scenario 1: Motion Detected ---");
        camera.detectMotion();
        
        System.out.println("\n--- Scenario 2: High Temperature ---");
        thermostat.detectHighTemperature();
        
        System.out.println("\n--- Scenario 3: Door Opened ---");
        frontDoor.open();
        
        System.out.println("\n--- Scenario 4: Night Mode ---");
        hub.notify("NIGHT_MODE", livingRoomLight);
    }
}
