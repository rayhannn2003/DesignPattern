package State.MediaPlayer;

public class StoppedState implements PlayerState {
    
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Starting playback from beginning");
        player.setState(new PlayingState());
    }
    
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already stopped");
    }
    
    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped");
    }
    
    @Override
    public void next(MediaPlayer player) {
        System.out.println("Loading next track");
        player.nextTrack();
    }
    
    @Override
    public String getStateName() {
        return "STOPPED";
    }
}
