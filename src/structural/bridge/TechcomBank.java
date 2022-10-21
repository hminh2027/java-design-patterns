package structural.bridge;

public class TechcomBank extends Bank{
    public TechcomBank(Card card) {
        super(card);
    }
    @Override
    public void openCard() {
        System.out.println("Opening card in TechcomBank...");
        card.openCard();
    }
}
