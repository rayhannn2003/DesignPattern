package Observer.CricketScore;

import java.util.ArrayList;
import java.util.List;

public class CricketMatch implements Subject {
    private int runs;
    private int wickets;
    private double overs;
    private List<Observer> displays;
    
    public CricketMatch() {
        this.runs = 0;
        this.wickets = 0;
        this.overs = 0.0;
        this.displays = new ArrayList<>();
    }
    
    @Override
    public void attach(Observer observer) {
        displays.add(observer);
    }
    
    @Override
    public void detach(Observer observer) {
        displays.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : displays) {
            observer.update(runs, wickets, overs);
        }
    }
    
    public void updateScore(int runs, int wickets, double overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        notifyObservers();
    }
}
