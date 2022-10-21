package structural.adapter

class Client (target: Target) {
    println(target.request())
}
