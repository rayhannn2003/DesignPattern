package Template.GameLevel;

public class EasyLevel extends GameLevel {
    
    @Override
    protected void loadAssets() {
        System.out.println("Loading basic textures and simple models");
    }
    
    @Override
    protected void createEntities() {
        System.out.println("Creating 5 enemies");
        System.out.println("Spawning 10 health packs");
    }
    
    @Override
    protected void setDifficulty() {
        System.out.println("Setting difficulty: EASY");
        System.out.println("Player health: 200, Enemy damage: 10");
    }
}
