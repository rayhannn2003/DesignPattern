package State.FanController;

public interface FanState {
    void pressButton(Fan fan);
    String getStateName();
    int getSpeed();
}
