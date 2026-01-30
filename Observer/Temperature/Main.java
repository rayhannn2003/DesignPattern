package Observer.Temperature;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer led = new LEDDisplay();

        station.addObserver(phone);
        station.addObserver(led);

        station.setTemperature(30.5f);
        station.setTemperature(32.0f);
    }
}
