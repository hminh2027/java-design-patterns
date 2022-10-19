package structural.adapter.code

class Client (target: Target) {
    println(target.request())
}
