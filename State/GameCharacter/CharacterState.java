package State.GameCharacter;

public interface CharacterState {
    void moveForward(Character character);
    void jump(Character character);
    void attack(Character character);
    void takeDamage(Character character, int damage);
    String getStateName();
}
