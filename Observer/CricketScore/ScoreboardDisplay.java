package Observer.CricketScore;

public class ScoreboardDisplay implements Observer {
    @Override
    public void update(int runs, int wickets, double overs) {
        System.out.println("\n[STADIUM SCOREBOARD]");
        System.out.println("┌────────────────────┐");
        System.out.println("│ RUNS: " + runs + "/" + wickets + "        │");
        System.out.println("│ OVERS: " + overs + "         │");
        System.out.println("└────────────────────┘");
    }
}
