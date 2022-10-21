package structural.bridge;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank vcb_credit = new VietcomBank(new CreditCard());
        Bank tcb_debit = new TechcomBank(new DebitCard());
        Bank tcb_prepaid = new TechcomBank(new PrepaidCard());

        vcb_credit.openCard();
        tcb_debit.openCard();
        tcb_prepaid.openCard();
    }
}
