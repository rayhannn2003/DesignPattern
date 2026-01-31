package State.GameCharacter;

public class WalkingState implements CharacterState {
    
    @Override
    public void moveForward(Character character) {
        System.out.println("Already walking");
    }
    
    @Override
    public void jump(Character character) {
        System.out.println("Jump while walking");
        character.setState(new JumpingState());
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Attack while walking");
        character.setState(new AttackingState());
    }
    
    @Override
    public void takeDamage(Character character, int damage) {
        character.reduceHealth(damage);
        System.out.println("Took " + damage + " damage while walking! HP: " + character.getHealth());
        if (character.getHealth() <= 0) {
            character.setState(new DeadState());
        } else {
            character.setState(new IdleState());
        }
    }
    
    @Override
    public String getStateName() {
        return "WALKING";
    }
}
