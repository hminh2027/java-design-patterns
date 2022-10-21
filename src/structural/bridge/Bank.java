package structural.bridge;

public abstract class Bank {
    protected Card card;

    public Bank(Card card) {
        this.card = card;
    }

    public abstract void openCard();
}
