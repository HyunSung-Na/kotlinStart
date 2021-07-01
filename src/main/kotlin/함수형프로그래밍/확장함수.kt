package 함수형프로그래밍

fun main() {

    val str1 = "abcd"
    println(str1.getUpperString())
}

// 기존 클래스에 새로운 함수를 추가하는 개념이다.
// 코틀린 코드에서는 기존 클래스에 메서드를 추가해 사용하는 것 처럼 보이지만
// 사실 객체의 주소값을 받은 함수가 만들어지고 그 함수를 호출하는 방식으로 동작한다.
fun String.getUpperString() : String {
    return this.toUpperCase()
}