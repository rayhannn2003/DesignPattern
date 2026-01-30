package State.LightState;

class RedLight implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight light) {
        System.out.println("Changing from RED to GREEN");
        light.setState(new GreenLight());
    }
    
}
