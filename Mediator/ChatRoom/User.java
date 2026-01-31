package Mediator.ChatRoom;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;
    
    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void send(String message);
    
    public abstract void receiveMessage(String message, User sender);
    
    public abstract void receiveNotification(String notification);
}
