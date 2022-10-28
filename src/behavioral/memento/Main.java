package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        System.out.println("Creating a new note...");
        NoteOriginator noteOriginator = new NoteOriginator("This is a note!", 1);
        System.out.println(noteOriginator);

        System.out.println("Updating note...");
        noteOriginator.setContent("This is still a note but version 2");
        noteOriginator.setVersion(noteOriginator.getVersion() + 1);
        careTaker.saveMemento(noteOriginator.save(), 2);
        System.out.println(noteOriginator);

        System.out.println("Restore note...");
        noteOriginator.restore(careTaker.getMemento(1));
        System.out.println(careTaker.getMemento(1));
        System.out.println("Restore note to version: " + noteOriginator.getVersion());
        System.out.println(noteOriginator);

    }

    private void createNote() {

    }

    private void restoreNote() {

    }

    private void updateNote() {

    }
}
