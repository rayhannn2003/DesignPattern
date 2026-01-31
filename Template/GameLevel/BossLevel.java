package Template.GameLevel;

public class BossLevel extends GameLevel {
    
    @Override
    protected void loadAssets() {
        System.out.println("Loading boss arena textures and special effects");
    }
    
    @Override
    protected void createEntities() {
        System.out.println("Creating BOSS enemy with special abilities");
        System.out.println("Spawning 5 health packs in arena corners");
    }
    
    @Override
    protected void setDifficulty() {
        System.out.println("Setting difficulty: BOSS BATTLE");
        System.out.println("Player health: 150, Boss health: 1000");
        System.out.println("Enabling special boss mechanics");
    }
}
