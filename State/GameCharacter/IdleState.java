package State.GameCharacter;

public class IdleState implements CharacterState {
    
    @Override
    public void moveForward(Character character) {
        System.out.println("Started walking");
        character.setState(new WalkingState());
    }
    
    @Override
    public void jump(Character character) {
        System.out.println("Jump from idle");
        character.setState(new JumpingState());
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Attack!");
        character.setState(new AttackingState());
    }
    
    @Override
    public void takeDamage(Character character, int damage) {
        character.reduceHealth(damage);
        System.out.println("Took " + damage + " damage! HP: " + character.getHealth());
        if (character.getHealth() <= 0) {
            character.setState(new DeadState());
        }
    }
    
    @Override
    public String getStateName() {
        return "IDLE";
    }
}
