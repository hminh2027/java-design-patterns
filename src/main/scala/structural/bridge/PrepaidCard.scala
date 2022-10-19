package structural.bridge

class PrepaidCard extends Card {
  override def openCard(): Unit = println("Mở thẻ trả trước thành công!")
}
