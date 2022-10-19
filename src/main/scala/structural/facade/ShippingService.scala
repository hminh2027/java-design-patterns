package structural.facade

class ShippingService {
  def shipping(address: String): Unit = {
    println("Đang gửi hàng tới địa chỉ: " + address)
  }
}
