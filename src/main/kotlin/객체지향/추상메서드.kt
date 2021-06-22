package 객체지향

fun main() {
    val obj = SubAbstractClass()

    obj.method2()
}

open abstract class SuperAbstractClass {

    fun method1() {
        println("SuperClass 의 메서드")
    }

    open abstract fun method2()
}

class SubAbstractClass : SuperAbstractClass() {

    override fun method2() {
        println("SubClass Method")
    }

}