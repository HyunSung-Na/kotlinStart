package 함수형프로그래밍

fun main() {
    val r1 = 100 add2 50

    println("r1 : $r1")
}

// 함수를 연산자처럼 사용할 수 있는 함수이다.
infix fun Int.add2(a1:Int) : Int {
    return this + a1
}