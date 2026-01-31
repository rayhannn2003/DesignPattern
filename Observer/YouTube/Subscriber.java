package Observer.YouTube;

public class Subscriber implements Observer {
    private String name;
    private boolean notificationsEnabled;
    
    public Subscriber(String name) {
        this.name = name;
        this.notificationsEnabled = true;
    }
    
    @Override
    public void update(String channelName, String videoTitle) {
        if (notificationsEnabled) {
            System.out.println("🔔 " + name + " notified: " + channelName + " - \"" + videoTitle + "\"");
        }
    }
    
    public void enableNotifications() {
        notificationsEnabled = true;
        System.out.println(name + " enabled notifications");
    }
    
    public void disableNotifications() {
        notificationsEnabled = false;
        System.out.println(name + " disabled notifications");
    }
    
    public String getName() {
        return name;
    }
}
