package Strategy.Notification;

/**
 * Context class: Manages the selected notification strategy.
 * 
 * Allows dynamic switching of notification channels without
 * affecting the client code or notification content logic.
 */
public class NotificationService {
    private NotificationStrategy strategy;
    
    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Dynamically switch notification channel at runtime.
     */
    public void setNotificationStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
        System.out.println("→ Notification channel switched to: " + strategy.getClass().getSimpleName());
    }
    
    /**
     * Send notification using the currently selected strategy.
     */
    public void sendNotification(String recipient, String message, String type) {
        if (strategy == null) {
            System.out.println("ERROR: No notification strategy set!");
            return;
        }
        strategy.send(recipient, message, type);
    }
}
