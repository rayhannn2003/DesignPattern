package Command.Light_Fan;

class FanOnCommand implements Command {
    private Fan fan;

    FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.on();
    }
}
