package Mediator.SmartHome;

public class SecurityCamera extends SmartDevice {
    private boolean recording;
    
    public SecurityCamera(SmartHomeMediator mediator, String name) {
        super(mediator, name);
        this.recording = false;
    }
    
    public void detectMotion() {
        System.out.println(name + ": Motion detected!");
        mediator.notify("MOTION_DETECTED", this);
    }
    
    public void startRecording() {
        recording = true;
        System.out.println(name + ": Started recording");
    }
    
    public void stopRecording() {
        recording = false;
        System.out.println(name + ": Stopped recording");
    }
}
