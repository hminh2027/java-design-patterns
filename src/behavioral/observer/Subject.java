package behavioral.observer;

public interface Subject {
    void subscribe(User user);
    void unsubscribe(User user);
    void _notify();
}
