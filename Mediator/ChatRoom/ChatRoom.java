package Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;
    private String roomName;
    
    public ChatRoom(String roomName) {
        this.users = new ArrayList<>();
        this.roomName = roomName;
        System.out.println("Chat room '" + roomName + "' created");
    }
    
    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " joined " + roomName);
        notifyUsers(user.getName() + " has joined the chat", user);
    }
    
    @Override
    public void removeUser(User user) {
        users.remove(user);
        System.out.println(user.getName() + " left " + roomName);
        notifyUsers(user.getName() + " has left the chat", user);
    }
    
    @Override
    public void sendMessage(String message, User sender) {
        System.out.println("[" + roomName + "] " + sender.getName() + ": " + message);
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message, sender);
            }
        }
    }
    
    private void notifyUsers(String notification, User excludeUser) {
        for (User user : users) {
            if (user != excludeUser) {
                user.receiveNotification(notification);
            }
        }
    }
}
