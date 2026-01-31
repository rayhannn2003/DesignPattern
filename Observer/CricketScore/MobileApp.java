package Observer.CricketScore;

public class MobileApp implements Observer {
    @Override
    public void update(int runs, int wickets, double overs) {
        System.out.println("\n[MOBILE APP NOTIFICATION]");
        System.out.println("📱 Score Update: " + runs + "/" + wickets + " (" + overs + " ov)");
    }
}
