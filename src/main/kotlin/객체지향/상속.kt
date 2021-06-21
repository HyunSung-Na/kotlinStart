package 객체지향

fun main() {

}

open class SuperClass {
    var superMember = 100

    fun superMethod() {
        println("superClass의 메서드 입니다.")
    }
}

class SubClass : SuperClass() {
    val subMember = 200

    fun subMember() {
        println("subClass의 메서드 입니다.")
    }
}

open class SuperClass2(val a1:Int)

class SubClass2 : SuperClass2(100)

class SubClass3 : SuperClass2 {
    constructor() : super(100)
}