package State.MediaPlayer;

public interface PlayerState {
    void play(MediaPlayer player);
    void pause(MediaPlayer player);
    void stop(MediaPlayer player);
    void next(MediaPlayer player);
    String getStateName();
}
