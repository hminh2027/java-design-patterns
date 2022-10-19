package structural.adapter.code

class Adapter (val adaptee: Adaptee) extends Target {

  override def request(): String = {
    val result = this.translate()
    return "Adapter (translator): TRANSLATED " + result
  }

  def translate(): String = {
    this.adaptee.specificRequest().toArray.reverse.mkString("")
  }
}
