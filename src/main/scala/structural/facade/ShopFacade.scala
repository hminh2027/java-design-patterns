package structural.facade

class ShopFacade
(
   paymentService: PaymentService = new PaymentService(),
   shippingService: ShippingService = new ShippingService(),
   smsService: SmsService = new SmsService(),
) {

  def placeOrderOnline(email: String, address: String): Unit = {
    println("Bắt đầu quy trình mua hàng trực tuyến...")
    paymentService.paymentByOnlineBanking()
    shippingService.shipping(address)
    smsService.sendSMS(email)
    println("Bạn đã nhận được hàng!")
  }

  def placeOrderOffline(): Unit = {
    println("Bắt đầu quy trình mua hàng trực tiếp...")
    paymentService.paymentByCash()
    println("Bạn đã nhận được hàng!")
  }
}
