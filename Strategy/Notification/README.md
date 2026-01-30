# Banking Notification System - Strategy Pattern

## Problem Statement
A banking platform needs a flexible notification system supporting multiple channels (Email, SMS, Mobile App) where customers can dynamically switch their preferred channel without affecting the notification logic.

## Solution: Strategy Pattern

### Participants

1. **Strategy Interface**: `NotificationStrategy`
   - Defines the contract: `send(recipient, message, type)`

2. **Concrete Strategies**:
   - `EmailNotification` - Formal email formatting with subject/body
   - `SMSNotification` - Concise, character-limited messages
   - `MobileAppNotification` - Rich push notifications with actions

3. **Context**: `NotificationService`
   - Holds the selected strategy
   - Provides `setNotificationStrategy()` for runtime switching
   - Delegates `sendNotification()` to the current strategy

4. **Client**: `BankingNotificationDemo`
   - Creates context and strategies
   - Switches strategies dynamically based on customer preferences

### Key Benefits
- ✅ **Dynamic switching**: Change notification channel at runtime
- ✅ **Extensibility**: Add new channels (WhatsApp, Voice, etc.) without modifying existing code
- ✅ **Separation of concerns**: Each channel handles its own formatting independently
- ✅ **Consistent content**: Same message structure across all channels

## Compilation & Execution

```bash
cd Strategy/Notification
javac *.java
java BankingNotificationDemo
```

## Expected Output
The demo shows:
1. Transaction alerts via Email
2. Low balance warnings via SMS (concise)
3. Promotional offers via Mobile App (rich formatting)
4. Seamless channel switching without code changes

## Extensibility Example
To add WhatsApp support:

```java
public class WhatsAppNotification implements NotificationStrategy {
    @Override
    public void send(String recipient, String message, String notificationType) {
        // WhatsApp-specific formatting
    }
}

// Usage:
customerNotifications.setNotificationStrategy(new WhatsAppNotification());
```

No changes needed to `NotificationService`, `BankingNotificationDemo`, or other strategies!
