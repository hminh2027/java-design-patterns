package structural.facade

class SmsService {
  def sendSMS(tel : String) : Unit = {
    println("Đang gửi tin nhắn thông báo tới số: " + tel)
  }
}
