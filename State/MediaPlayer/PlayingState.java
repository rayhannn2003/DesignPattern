package State.MediaPlayer;

public class PlayingState implements PlayerState {
    
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing");
    }
    
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Playback paused");
        player.setState(new PausedState());
    }
    
    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Playback stopped");
        player.setState(new StoppedState());
    }
    
    @Override
    public void next(MediaPlayer player) {
        System.out.println("Playing next track");
        player.nextTrack();
    }
    
    @Override
    public String getStateName() {
        return "PLAYING ▶";
    }
}
