package structural.bridge;

public class VietcomBank extends Bank{
    public VietcomBank(Card card) {
        super(card);
    }
    @Override
    public void openCard() {
        System.out.println("Opening card in VietcomBank...");
        card.openCard();
    }
}
