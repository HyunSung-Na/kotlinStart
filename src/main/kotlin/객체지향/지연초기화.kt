package 객체지향

import kotlin.Lazy as Lazy1

fun main() {
    val obj = TestLaze()

    println("obj.a1 : ${obj.a1}")

    println("obj.a2 : ${obj.a2}")

    obj.testMethod()
    println("obj.a3 : ${obj.a3}")

    println("obj.a4 : ${obj.a4}")
}

class TestLaze {
    var a1:Int = 100
    var a2:Int

    // val 로는 setter 가 생성 안되서 값을 나중에 설정할 수 없기 때문에 안된다.
    // Int, Long 과 같은 기본형을 감싼 자료형은 불가능
    lateinit var a3:String

    // a4 변수를 사용할 때 밑에 문자열 2가 a4 로 초기화가 됨, 메모리를 절약할 수 있다는 장점
    val a4:String by lazy{
        println("a4 init")
        "문자열2"
    }

    init {
        a2 = 200
    }

    // 초기화가 되어 있지 않으면 설정
    fun testMethod() {

        // 리플렉션으로 접근
        if (::a3.isInitialized == false) {
            a3 = "문자열"
        }
    }
}