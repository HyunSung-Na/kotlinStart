package 다양한클래스

fun main() {

    // 객체를 생성할 때 값을 넘겨주기 때문에 서로 다르게 값을 세팅할 수 있다.
    val v1 = Number1.SealedTwo(1)
    val v2 = Number1.SealedTwo(2)

    checkNumber1(v1)
    checkNumber1(v2)
}

// 열거형은 특정 값을 의미하는 상수들을 모아 관리하는 개념이라면 Sealed Class 는 객체를 모아 관리하는 개념
// 열거형의 경우 상수로 지정된 값을 절대로 변경 불가능 하지만, Sealed Class 는 객체를 관리하므로
// 객체가 가지고 있는 변수에 값을 설정해서 지정된 값을 변경하는 것이 가능하다
// 열거형 사용시 상수가 의미하는 값을 수시로 변경하거나 다양한 형태로 사용하고자 할 때 사용한다.
sealed class Number1 {
    class SealedOne(val a1:Int) : Number1()
    class SealedTwo(val a1:Int) : Number1()
    class SealedThree(val a1:Int) : Number1()
}

fun checkNumber1(a1:Number1) {
    when(a1) {
        is Number1.SealedOne -> println("One 입니다.")
        is Number1.SealedTwo -> println("Two 입니다.")
        is Number1.SealedThree -> println("Three 입니다.")
    }
}