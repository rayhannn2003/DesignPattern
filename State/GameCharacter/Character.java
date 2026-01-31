package State.GameCharacter;

public class Character {
    private CharacterState state;
    private int health;
    private String name;
    
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.state = new IdleState();
        System.out.println(name + " created with " + health + " HP");
    }
    
    public void setState(CharacterState state) {
        this.state = state;
        System.out.println("→ " + name + " state: " + state.getStateName());
    }
    
    public void moveForward() {
        state.moveForward(this);
    }
    
    public void jump() {
        state.jump(this);
    }
    
    public void attack() {
        state.attack(this);
    }
    
    public void takeDamage(int damage) {
        state.takeDamage(this, damage);
    }
    
    public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
    
    public int getHealth() {
        return health;
    }
}
