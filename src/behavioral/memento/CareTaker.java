package behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private final Map<Integer, Memento> storage = new HashMap<Integer, Memento>();

    public void saveMemento(Memento memento, int version) {
        System.out.println("Saving note ...");
        storage.put(version, memento);
        System.out.println("Note version " + version + " saved successfully");
    }

    public Memento getMemento(int version) {
        return storage.get(version);
    }

    public void clearMemento() {
        System.out.println("Clearing all versions ...");
        storage.clear();
    }
}
