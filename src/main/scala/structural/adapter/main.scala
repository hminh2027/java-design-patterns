package structural.adapter

class main {
  println("Client (human): I use Target language:")
  new Client(new Target())
  println("Client (human): The Adaptee has a weird language. See, i don't understand it:")

  val adaptee = new Adaptee()
  println("Adaptee (bot): " + adaptee.specificRequest())

  println("Client (human): But i can understand it via the Adapter:")
  new Client(new Adapter(adaptee))
}
