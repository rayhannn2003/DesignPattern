package State.LightThread;
public class RedLight implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Red Light - STOP");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        context.setState(new YellowLight());
    }
}
