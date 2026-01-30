package State.LightState;

class YellowLight implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight light) {
        System.out.println("Changing from YELLOW to RED");
        light.setState(new RedLight());
    }
    
}
