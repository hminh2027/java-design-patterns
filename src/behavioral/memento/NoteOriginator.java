package behavioral.memento;

public class NoteOriginator {
    private String content;
    private int version;

    public NoteOriginator(String content, int version) {
        this.content = content;
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Memento save() {
        return new Memento(this.content, this.version);
    }

    public void restore(Memento memento) {
        if (memento == null) {
            System.out.println("Version not exist!");
        }
        else {
            this.content = memento.getContent();
            this.version = memento.getVersion();
        }
    }

    @Override
    public String toString() {
        return "Version: " + version + " Content: " + content;
    }
}
