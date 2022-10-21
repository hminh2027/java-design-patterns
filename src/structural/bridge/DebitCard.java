package structural.bridge;

public class DebitCard implements Card {
    @Override
    public void openCard() {
        System.out.println("Created a new debit card!");
    }
}
