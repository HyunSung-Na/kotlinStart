package 객체지향

fun main() {

    val obj = AccessClass("hyunSung", 20)

    println("obj.name : ${obj.name}")
    println("obj.age : ${obj.age}")
}

// 코틀린은 그냥 멤버 변수를 정의하면 private로 정해진다. 또한 객체에 .을 찍어 직접 접근하는 것
// 처럼 보이지만 바이트 코드로 변환하면 getter와 setter로 접근하고 있다.

class AccessClass(name:String, age:Int) {
    var name = name
    var age = age
}