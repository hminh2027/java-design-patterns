package structural.bridge;

public class PrepaidCard implements Card {
    @Override
    public void openCard() {
        System.out.println("Created a new prepaid card!");
    }
}
