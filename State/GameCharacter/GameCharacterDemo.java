package State.GameCharacter;

public class GameCharacterDemo {
    public static void main(String[] args) {
        System.out.println("=== Game Character State Simulation ===\n");
        
        Character hero = new Character("Hero", 100);
        
        System.out.println("\n--- Scenario 1: Basic Movement ---");
        hero.moveForward();
        hero.jump();
        
        System.out.println("\n--- Scenario 2: Combat ---");
        hero.attack();
        hero.attack();
        
        System.out.println("\n--- Scenario 3: Taking Damage ---");
        hero.takeDamage(30);
        hero.moveForward();
        hero.takeDamage(20);
        
        System.out.println("\n--- Scenario 4: Aerial Combat ---");
        hero.jump();
        hero.jump();
        hero.attack();
        
        System.out.println("\n--- Scenario 5: Death ---");
        hero.takeDamage(60);
        hero.moveForward();
        hero.attack();
        hero.jump();
        
        System.out.println("\nGame Over!");
    }
}
