package structural.facade;

public class ShopFacade {
    PaymentService paymentService;
    ShippingService shippingService;
    SmsService smsService;

    public ShopFacade() {
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.smsService = new SmsService();
    }

    public void placeOrderOnline(String email, String address) {
        System.out.println("Placing order online...");
        paymentService.paymentByOnlineBanking();
        shippingService.shipping(address);
        smsService.sendSMS(email);
        System.out.println("Package received!");
    }

    public void placeOrderOffline() {
        System.out.println("Placing order offline...");
        paymentService.paymentByOnlineBanking();
        System.out.println("Package received!");
    }
}
