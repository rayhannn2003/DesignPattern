package Observer.Temperature;

class PhoneDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Phone Display: " + temperature);
    }
}
