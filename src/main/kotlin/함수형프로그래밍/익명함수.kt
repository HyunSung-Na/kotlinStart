package 함수형프로그래밍

fun main() {

    val testFunc1 = fun() {
        println("테스트 함수 입니다.")
    }

    // 함수 호출
    testFunc1()
}

// 함수의 이름이 없는 함수
// 함수를 변수에 담아 관리할 때 사용
// 뒤에 배울 고차함수와 연관이 있다.