package structural.facade

class PaymentService {
  def paymentByOnlineBanking(): Unit = {
    println("Thanh toán bằng tài khoản ngân hàng")
  }
  def paymentByCash(): Unit = {
    println("Thanh toán bằng tiền mặt")
  }
}
