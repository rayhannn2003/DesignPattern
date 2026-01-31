package Template.GameLevel;

public class GameLevelDemo {
    public static void main(String[] args) {
        System.out.println("=== Game Level Loader Template Pattern ===\n");
        
        System.out.println("--- Loading Easy Level ---");
        GameLevel easyLevel = new EasyLevel();
        easyLevel.loadLevel();
        
        System.out.println("\n--- Loading Hard Level ---");
        GameLevel hardLevel = new HardLevel();
        hardLevel.loadLevel();
        
        System.out.println("\n--- Loading Boss Level ---");
        GameLevel bossLevel = new BossLevel();
        bossLevel.loadLevel();
    }
}
