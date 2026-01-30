package State.LightState;

class GreenLight implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight light) {
        System.out.println("Changing from GREEN to YELLOW");
        light.setState(new YellowLight());
    }
    
}
