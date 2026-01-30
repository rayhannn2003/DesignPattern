package State.LightThread;
public class YellowLight implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Yellow Light - GET READY");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        context.setState(new GreenLight());
    }
}
