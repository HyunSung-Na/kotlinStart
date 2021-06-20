fun main() {
    test1()

    val k1:Int = 100
    val k2:Double = 11.11

    test(k1, k2)
    // 매개 변수 값을 지정해서 넣을 수 있다.
    test(a2 = 66.66, a1 = 600)

    // 매개변수의 기본값을 설정
    test3(100)

    // 반환값이 있는 함수
    val test4 = test4(1, 2)

    // 반환값이 없는 함수 Unit 생략 가능
    test5()

    // 내부함수 호출
    test6()
}

fun test1() {
    println("테스트1 함수 호출")
}

fun test(a1:Int, a2:Double) {
    println("테스트2 함수 ${a1}, ${a2}")
}

fun test3(a1:Int = 0, a2:Double = 0.0) {
    println("테스트 3 함수 ${a1}, ${a2}")
}

fun test4(a1: Int, a2: Int) : Int {
    println()
    return a1 + a2
}

fun test5() : Unit {
    println("test5 호출")
}

fun test6() {
    fun test7() {
        println("내부 함수 실행")
    }

    test7()
}