package Command.RemoteControl;

public class RemoteControlDemo {
    public static void main(String[] args) {
        System.out.println("=== Universal Remote Control ===\n");
        
        RemoteControl remote = new RemoteControl();
        
        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight = new Light("Bedroom");
        TV livingRoomTV = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        
        TVOnCommand tvOn = new TVOnCommand(livingRoomTV);
        
        StereoOnWithCDCommand stereoOnCD = new StereoOnWithCDCommand(stereo);
        
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, bedroomLightOn, bedroomLightOff);
        remote.setCommand(2, tvOn, new NoCommand());
        remote.setCommand(3, stereoOnCD, new NoCommand());
        
        System.out.println("--- Testing slot 0 (Living Room Light) ---");
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();
        
        System.out.println("\n--- Testing slot 1 (Bedroom Light) ---");
        remote.onButtonPressed(1);
        remote.undoButtonPressed();
        
        System.out.println("\n--- Testing slot 2 (TV) ---");
        remote.onButtonPressed(2);
        remote.undoButtonPressed();
        
        System.out.println("\n--- Testing slot 3 (Stereo with CD) ---");
        remote.onButtonPressed(3);
        remote.undoButtonPressed();
    }
}
