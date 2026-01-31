package State.GameCharacter;

public class JumpingState implements CharacterState {
    
    @Override
    public void moveForward(Character character) {
        System.out.println("Moving forward in air");
    }
    
    @Override
    public void jump(Character character) {
        System.out.println("Cannot double jump");
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Aerial attack!");
        character.setState(new AttackingState());
    }
    
    @Override
    public void takeDamage(Character character, int damage) {
        character.reduceHealth(damage);
        System.out.println("Took " + damage + " damage in air! HP: " + character.getHealth());
        if (character.getHealth() <= 0) {
            character.setState(new DeadState());
        } else {
            System.out.println("Landed");
            character.setState(new IdleState());
        }
    }
    
    @Override
    public String getStateName() {
        return "JUMPING";
    }
}
