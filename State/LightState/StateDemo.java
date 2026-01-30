package State.LightState;

public class StateDemo {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        // Simulate changing lights
        for (int i = 0; i < 6; i++) {
            light.next();
        }
    }
}
