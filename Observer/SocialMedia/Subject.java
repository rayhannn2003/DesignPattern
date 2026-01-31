package Observer.SocialMedia;

public interface Subject {
    void addFollower(Observer observer);
    void removeFollower(Observer observer);
    void notifyFollowers();
}
