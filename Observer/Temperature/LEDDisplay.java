package Observer.Temperature;

class LEDDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("LED Display: " + temperature);
    }
}
