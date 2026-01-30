package Command;

public class CommandDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        Fan fan = new Fan();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setCommand(new FanOnCommand(fan));
        remote.pressButton();
    }
}
