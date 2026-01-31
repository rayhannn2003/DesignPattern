package State.MediaPlayer;

public class PausedState implements PlayerState {
    
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming playback");
        player.setState(new PlayingState());
    }
    
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused");
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
        player.setState(new PlayingState());
    }
    
    @Override
    public String getStateName() {
        return "PAUSED ⏸";
    }
}
