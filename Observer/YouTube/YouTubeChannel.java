package Observer.YouTube;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private String channelName;
    private List<Observer> subscribers;
    private String latestVideo;
    
    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }
    
    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println("New subscriber joined " + channelName);
    }
    
    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println("A subscriber left " + channelName);
    }
    
    @Override
    public void notifySubscribers() {
        for (Observer observer : subscribers) {
            observer.update(channelName, latestVideo);
        }
    }
    
    public void uploadVideo(String videoTitle) {
        System.out.println("\n" + channelName + " uploaded: \"" + videoTitle + "\"");
        latestVideo = videoTitle;
        System.out.println("Notifying " + subscribers.size() + " subscribers...");
        notifySubscribers();
    }
    
    public String getChannelName() {
        return channelName;
    }
}
