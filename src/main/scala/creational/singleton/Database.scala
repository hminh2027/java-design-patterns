package creational.singleton

object Database {
  var CONNECTION: String = ""

  def getConnection: String = {
    if (CONNECTION == "") {
      println("Không tìm thấy Connection! Đang khởi tạo...")
      CONNECTION = "Đây là đối tượng Connection!"
    }
    return CONNECTION
  }
}
