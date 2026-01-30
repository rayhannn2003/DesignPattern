package Strategy.Notification;
/**
 * Demo: Banking Notification System using Strategy Pattern
 * 
 * Demonstrates:
 * 1. Dynamic strategy switching at runtime
 * 2. Channel-specific formatting (Email, SMS, Mobile App)
 * 3. Extensibility without modifying existing code
 */
public class BankingNotificationDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Banking Notification System Demo ===\n");
        
        // Customer's notification service (starts with Email)
        NotificationService customerNotifications = new NotificationService(new EmailNotification());
        
        // Scenario 1: Transaction notification via Email
        System.out.println("--- Scenario 1: Incoming Transaction Alert ---");
        customerNotifications.sendNotification(
            "customer@example.com",
            "You have received $500.00 from John Doe. Your new balance is $2,350.00.",
            "Incoming Transaction"
        );
        
        // Scenario 2: Customer switches to SMS
        System.out.println("\n--- Scenario 2: Customer prefers SMS for urgent alerts ---");
        customerNotifications.setNotificationStrategy(new SMSNotification());
        customerNotifications.sendNotification(
            "+1-555-0123",
            "Low balance alert! Your account balance has fallen below $100. Current balance: $85.50. Please add funds.",
            "Low Balance Warning"
        );
        
        // Scenario 3: Switch to Mobile App for promotional offers
        System.out.println("\n--- Scenario 3: Promotional offer via Mobile App ---");
        customerNotifications.setNotificationStrategy(new MobileAppNotification());
        customerNotifications.sendNotification(
            "USER_12345",
            "Exclusive offer: Get 5% cashback on all online purchases this month! Terms apply.",
            "Promotional Offer"
        );
        
        // Scenario 4: Outgoing transaction via current channel (Mobile App)
        System.out.println("\n--- Scenario 4: Outgoing Transaction (same channel) ---");
        customerNotifications.sendNotification(
            "USER_12345",
            "Payment of $150.00 to Electric Company was successful. Remaining balance: $1,200.00.",
            "Outgoing Transaction"
        );
        
        // Scenario 5: Switch back to Email for detailed statements
        System.out.println("\n--- Scenario 5: Monthly statement via Email ---");
        customerNotifications.setNotificationStrategy(new EmailNotification());
        customerNotifications.sendNotification(
            "customer@example.com",
            "Your monthly statement is ready. Total transactions: 45, Total spent: $3,200.00, Total received: $5,500.00.",
            "Monthly Statement"
        );
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("Note: All notifications maintained consistent content across different channels.");
        System.out.println("Strategy pattern allowed seamless channel switching without code changes.\n");
    }
}
