package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Fanpage implements Subject{
    private final String pagename;
    private final List<Observer> observers = new ArrayList<Observer>();

    public Fanpage(String pagename) {
        this.pagename = pagename;
    }

    public void uploadPost(String content) {
        System.out.println("Fanpage (" + pagename + "): " + content);
        _notify();
    }

    @Override
    public void subscribe(User user) {
        if(!observers.contains(user)) observers.add(user);
    }

    @Override
    public void unsubscribe(User user) {
        observers.remove(user);
    }

    @Override
    public void _notify() {
        for (Observer o : observers) {
            o.update(pagename);
        }
    }
}
