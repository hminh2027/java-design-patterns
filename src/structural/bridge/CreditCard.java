package structural.bridge;

public class CreditCard implements Card {
    @Override
    public void openCard() {
        System.out.println("Created a new credit card!");
    }
}
