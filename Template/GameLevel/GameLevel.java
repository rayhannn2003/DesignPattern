package Template.GameLevel;

public abstract class GameLevel {
    
    public final void loadLevel() {
        initialize();
        loadAssets();
        createEntities();
        setDifficulty();
        startLevel();
    }
    
    protected void initialize() {
        System.out.println("Initializing game level");
    }
    
    protected abstract void loadAssets();
    
    protected abstract void createEntities();
    
    protected abstract void setDifficulty();
    
    protected void startLevel() {
        System.out.println("Level started!");
    }
}
