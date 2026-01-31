package State.GameCharacter;

public class DeadState implements CharacterState {
    
    @Override
    public void moveForward(Character character) {
        System.out.println("Cannot move - character is dead");
    }
    
    @Override
    public void jump(Character character) {
        System.out.println("Cannot jump - character is dead");
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Cannot attack - character is dead");
    }
    
    @Override
    public void takeDamage(Character character, int damage) {
        System.out.println("Already dead");
    }
    
    @Override
    public String getStateName() {
        return "DEAD ☠";
    }
}
