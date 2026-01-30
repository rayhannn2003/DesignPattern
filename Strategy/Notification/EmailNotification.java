package Strategy.Notification;
/**
 * Concrete Strategy: Email Notification
 * Handles email-specific formatting and delivery logic.
 */
public class EmailNotification implements NotificationStrategy {
    
    @Override
    public void send(String recipient, String message, String notificationType) {
        System.out.println("\n=== EMAIL NOTIFICATION ===");
        System.out.println("To: " + recipient);
        System.out.println("Subject: [" + notificationType + "]");
        System.out.println("Body:");
        System.out.println("Dear Customer,");
        System.out.println(message);
        System.out.println("\nBest Regards,");
        System.out.println("Your Bank Team");
        System.out.println("==========================\n");
    }
}
