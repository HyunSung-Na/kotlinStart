package 함수형프로그래밍

fun main() {
    val r1 = testFunc1(100, 200)
    println("r1 : $r1")

    val r2 = testFun2(100, 200)
    println("r2 : $r2")

    // 람다 함수
    val lambda1 : (Int, Int) -> Int = {a1:Int, a2:Int -> a1 + a2}

    // 타입 생략 가능
    val lambda2 = {a1:Int, a2:Int -> a1 + a2}

    // 다른 표현 방법
    val lambda3 : (Int, Int) -> Int = {a1, a2 -> a1 + a2}

    // 다른 표현 방법
    val lambda4 = {a1:Int, a2:Int ->
        val r1 = a1 + a2
        val r2 = a1 - a2

        // 제일 마지막에 써놓은 것이 최종 연산의 결과로 리턴 리턴을 따로 명시 안해줘도 된다.
        r1 * r2
    }

    val r4 = lambda1(100, 200)
    println("r4 : ${r4}")

    val r5 = lambda4(100, 200)
    println("r5 : ${r5}")
}

fun testFunc1(a1:Int, a2:Int) : Int {
    return a1 + a2
}

fun testFun2(a1:Int, a2:Int) : Int = a1 + a2