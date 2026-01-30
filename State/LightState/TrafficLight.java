package State.LightState;

class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedLight(); // Initial state
    }

    void setState(TrafficLightState state) {
        this.state = state;
    }

    public void next() {
        state.changeLight(this);
    }
}