package creational.singleton

case class main() {
  println("Lần đầu gọi hàm getConnection():")
  println(Database.getConnection)
  println("Lần hai gọi hàm getConnection():")
  println(Database.getConnection)
  println("Lần ba gọi hàm getConnection():")
  println(Database.getConnection)
}
