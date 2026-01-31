package State.MediaPlayer;

public class MediaPlayer {
    private PlayerState state;
    private String[] playlist;
    private int currentTrack;
    
    public MediaPlayer(String[] playlist) {
        this.state = new StoppedState();
        this.playlist = playlist;
        this.currentTrack = 0;
    }
    
    public void setState(PlayerState state) {
        this.state = state;
        System.out.println("→ " + state.getStateName() + " - " + getCurrentTrackName());
    }
    
    public void play() {
        state.play(this);
    }
    
    public void pause() {
        state.pause(this);
    }
    
    public void stop() {
        state.stop(this);
    }
    
    public void next() {
        state.next(this);
    }
    
    public void nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.length;
    }
    
    public String getCurrentTrackName() {
        return playlist[currentTrack];
    }
}
