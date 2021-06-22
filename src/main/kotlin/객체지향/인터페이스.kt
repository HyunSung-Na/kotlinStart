package 객체지향

fun main() {
    val obj = InterfaceClass()

    obj.interMethod1()
}

interface Interface1 {
    fun interMethod1 ()
}

class InterfaceClass : Interface1 {
    override fun interMethod1() {
        println("override Interface Method")
    }
}