package Observer.CricketScore;

public class TVBroadcast implements Observer {
    @Override
    public void update(int runs, int wickets, double overs) {
        System.out.println("\n[TV BROADCAST]");
        System.out.println("Live Score: " + runs + " runs for " + wickets + " wickets");
        System.out.println("Overs completed: " + overs);
        double runRate = overs > 0 ? runs / overs : 0;
        System.out.println("Current Run Rate: " + String.format("%.2f", runRate));
    }
}
