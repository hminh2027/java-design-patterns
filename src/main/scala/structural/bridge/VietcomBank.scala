package structural.bridge

class VietcomBank(card: Card) extends Bank(card) {
  override def openCard(): Unit = {
    println("Đang mở thẻ tại ngân hàng VCB...")
    card.openCard()
  }
}
