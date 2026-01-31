package Observer.CricketScore;

public class CricketScoreDemo {
    public static void main(String[] args) {
        System.out.println("=== Cricket Live Score System ===\n");
        
        CricketMatch match = new CricketMatch();
        
        ScoreboardDisplay scoreboard = new ScoreboardDisplay();
        TVBroadcast tvBroadcast = new TVBroadcast();
        MobileApp mobileApp = new MobileApp();
        
        System.out.println("--- All displays connected ---");
        match.attach(scoreboard);
        match.attach(tvBroadcast);
        match.attach(mobileApp);
        
        System.out.println("\n--- Match begins ---");
        match.updateScore(0, 0, 0.0);
        
        System.out.println("\n--- After 5 overs ---");
        match.updateScore(45, 1, 5.0);
        
        System.out.println("\n--- After 10 overs ---");
        match.updateScore(98, 2, 10.0);
        
        System.out.println("\n--- After 15 overs ---");
        match.updateScore(156, 4, 15.0);
        
        System.out.println("\n--- After 20 overs (Match End) ---");
        match.updateScore(203, 6, 20.0);
    }
}
