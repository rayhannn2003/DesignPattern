package Strategy.Notification;
/**
 * Concrete Strategy: SMS Notification
 * Handles SMS-specific formatting (concise, character-limited).
 */
public class SMSNotification implements NotificationStrategy {
    
    @Override
    public void send(String recipient, String message, String notificationType) {
        System.out.println("\n=== SMS NOTIFICATION ===");
        System.out.println("To: " + recipient);
        // SMS requires concise formatting
        String smsMessage = "[" + notificationType + "] " + truncate(message, 140);
        System.out.println("Message: " + smsMessage);
        System.out.println("========================\n");
    }
    
    private String truncate(String msg, int maxLength) {
        if (msg.length() <= maxLength) return msg;
        return msg.substring(0, maxLength - 3) + "...";
    }
}
