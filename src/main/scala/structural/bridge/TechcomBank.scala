package structural.bridge

class TechcomBank(card: Card) extends Bank(card) {
  override def openCard(): Unit = {
    println("Đang mở thẻ tại ngân hàng TCB...")
    card.openCard()
  }
}
