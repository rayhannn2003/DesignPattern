package Mediator.ChatRoom;

public class ChatUser extends User {
    
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }
    
    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }
    
    @Override
    public void receiveMessage(String message, User sender) {
        System.out.println(name + " received from " + sender.getName() + ": " + message);
    }
    
    @Override
    public void receiveNotification(String notification) {
        System.out.println(name + " notified: " + notification);
    }
}
