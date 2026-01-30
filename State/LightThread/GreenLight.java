package State.LightThread;
public class GreenLight implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Green Light - GO");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        context.setState(new RedLight());
    }
}
