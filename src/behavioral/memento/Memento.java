package behavioral.memento;

public class Memento {
    private final String content;
    private final int version;

    public Memento(String content, int version) {
        this.content = content;
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public String getContent() {
        return content;
    }


}
