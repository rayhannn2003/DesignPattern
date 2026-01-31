package Observer.SocialMedia;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject {
    private String name;
    private List<Observer> followers;
    private String latestPost;
    
    public Celebrity(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    }
    
    @Override
    public void addFollower(Observer observer) {
        followers.add(observer);
        System.out.println("New follower subscribed to " + name);
    }
    
    @Override
    public void removeFollower(Observer observer) {
        followers.remove(observer);
        System.out.println("A follower unsubscribed from " + name);
    }
    
    @Override
    public void notifyFollowers() {
        for (Observer observer : followers) {
            observer.update(name, latestPost);
        }
    }
    
    public void post(String content) {
        System.out.println("\n" + name + " posted: \"" + content + "\"");
        latestPost = content;
        notifyFollowers();
    }
    
    public String getName() {
        return name;
    }
}
