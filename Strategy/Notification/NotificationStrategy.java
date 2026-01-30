package Strategy.Notification;
/**
 * Strategy interface for notification delivery.
 * 
 * Each concrete strategy implements its own channel-specific
 * formatting and sending logic.
 */
public interface NotificationStrategy {
    void send(String recipient, String message, String notificationType);
}
