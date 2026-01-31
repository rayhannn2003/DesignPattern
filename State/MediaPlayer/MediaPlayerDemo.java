package State.MediaPlayer;

public class MediaPlayerDemo {
    public static void main(String[] args) {
        System.out.println("=== Media Player Simulation ===\n");
        
        String[] playlist = {"Song 1.mp3", "Song 2.mp3", "Song 3.mp3"};
        MediaPlayer player = new MediaPlayer(playlist);
        
        System.out.println("--- Scenario 1: Normal Playback ---");
        player.play();
        player.pause();
        player.play();
        player.stop();
        
        System.out.println("\n--- Scenario 2: Skip to Next ---");
        player.play();
        player.next();
        player.next();
        
        System.out.println("\n--- Scenario 3: Pause and Skip ---");
        player.pause();
        player.next();
        
        System.out.println("\n--- Scenario 4: Invalid Operations ---");
        player.stop();
        player.pause();
        player.stop();
        
        System.out.println("\n--- Scenario 5: Quick Navigation ---");
        player.next();
        player.play();
        player.next();
        player.stop();
    }
}
