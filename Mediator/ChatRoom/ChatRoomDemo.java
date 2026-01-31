package Mediator.ChatRoom;

public class ChatRoomDemo {
    public static void main(String[] args) {
        System.out.println("=== Chat Room Mediator Pattern ===\n");
        
        ChatMediator chatRoom = new ChatRoom("Design Patterns");
        
        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");
        User charlie = new ChatUser(chatRoom, "Charlie");
        
        System.out.println("\n--- Users Joining ---");
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);
        
        System.out.println("\n--- Conversation ---");
        alice.send("Hello everyone!");
        bob.send("Hi Alice!");
        charlie.send("Hey folks, what's up?");
        
        System.out.println("\n--- User Leaving ---");
        chatRoom.removeUser(bob);
        
        System.out.println("\n--- Continued Conversation ---");
        alice.send("Anyone want to discuss Observer pattern?");
        charlie.send("Sure, sounds interesting!");
    }
}
