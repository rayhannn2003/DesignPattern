package State.LightThread;
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        System.out.println("Traffic Light System Started\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Cycle " + (i + 1) + ":");
            trafficLight.change();
            trafficLight.change();
            trafficLight.change();
            System.out.println();
        }

        System.out.println("Traffic Light System Stopped");
    }
}
