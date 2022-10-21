package structural.facade;

public class PaymentService {
    public void paymentByOnlineBanking() {
        System.out.println("paid the bill with online banking");
    }

    public void paymentByCash() {
        System.out.println("paying the bill with cash");
    }
}
