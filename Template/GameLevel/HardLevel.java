package Template.GameLevel;

public class HardLevel extends GameLevel {
    
    @Override
    protected void loadAssets() {
        System.out.println("Loading high-quality textures and complex models");
    }
    
    @Override
    protected void createEntities() {
        System.out.println("Creating 20 enemies");
        System.out.println("Spawning 3 health packs");
    }
    
    @Override
    protected void setDifficulty() {
        System.out.println("Setting difficulty: HARD");
        System.out.println("Player health: 100, Enemy damage: 50");
    }
}
