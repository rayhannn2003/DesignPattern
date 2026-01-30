package Strategy.Notification;
/**
 * Concrete Strategy: Mobile App Push Notification
 * Handles push notification formatting with rich content support.
 */
public class MobileAppNotification implements NotificationStrategy {
    
    @Override
    public void send(String recipient, String message, String notificationType) {
        System.out.println("\n=== MOBILE APP PUSH NOTIFICATION ===");
        System.out.println("User ID: " + recipient);
        System.out.println("Title: " + notificationType);
        System.out.println("Body: " + message);
        System.out.println("Action: Tap to view details");
        System.out.println("Badge: +1");
        System.out.println("====================================\n");
    }
}
