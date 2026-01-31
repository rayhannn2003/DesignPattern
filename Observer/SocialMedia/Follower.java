package Observer.SocialMedia;

public class Follower implements Observer {
    private String name;
    
    public Follower(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String channelName, String content) {
        System.out.println(name + "'s feed: " + channelName + " - \"" + content + "\"");
    }
    
    public String getName() {
        return name;
    }
}
