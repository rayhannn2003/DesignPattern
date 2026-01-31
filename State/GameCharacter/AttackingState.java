package State.GameCharacter;

public class AttackingState implements CharacterState {
    
    @Override
    public void moveForward(Character character) {
        System.out.println("Cannot move while attacking");
    }
    
    @Override
    public void jump(Character character) {
        System.out.println("Cannot jump while attacking");
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Combo attack!");
        System.out.println("Attack finished, back to idle");
        character.setState(new IdleState());
    }
    
    @Override
    public void takeDamage(Character character, int damage) {
        character.reduceHealth(damage);
        System.out.println("Took " + damage + " damage during attack! HP: " + character.getHealth());
        if (character.getHealth() <= 0) {
            character.setState(new DeadState());
        } else {
            System.out.println("Attack interrupted");
            character.setState(new IdleState());
        }
    }
    
    @Override
    public String getStateName() {
        return "ATTACKING";
    }
}
