package 함수형프로그래밍

fun main() {
    val t1 = fun(x1:Int, x2:Int) : Int {
        return x1 + x2
    }

    // 함수를 넘겨 줄 수 있다.
    testOrderFunc(100, 200, t1)

    // 익명함수로 바로 넘길 수도 있다
    testOrderFunc(200, 100, (fun(x1:Int, x2:Int) : Int {
        return x1 + x2
    }))

    // 람다함수로 바로 넘길 수도 있다
    val lambda1 = {x1:Int, x2:Int -> x1 + x2}
    testOrderFunc(100, 200, lambda1)
    testOrderFunc(100, 200, {x1:Int, x2:Int -> x1 / x2})

    val t2 = testOrderFunc1()
    val r2 = t2(100, 100)
    println("r2 : $r2")

    val t3 = testOrderFunc2()
    val r3 = t3(200, 100)
    println("r3 : $r3")

    testOrderFunc3({x1:Int -> x1 + 100}, 200)
    // 매개변수가 1개인 경우 it을 사용해서 간단하게 사용할 수 있다.
    testOrderFunc3({it + 100}, 200)

    testOrderFunc4(100, 200, {x1:Int, x2:Int -> x1 + x2})
    // 코드가 길 경우 옆으로 빼서 길게 작성할 수도 있다.
    testOrderFunc4(100, 200){x1:Int, x2:Int -> x1 + x2}

    testOrderFunc5({x1:Int -> println(x1)})
    testOrderFunc5 { println(it) }
}

// 함수를 매개변수로 받거나 반환타입이 함수인 함수를 고차함수라 한다.
// 함수 호출시 전달하는 함수와 반환하는 함수는 람다식을 사용할 수 있다.
fun testOrderFunc(a1:Int, a2:Int, m1:(Int, Int) -> Int) {
    val r1 = m1(a1, a2)
    println("r1 : $r1")
}

fun testOrderFunc1() : (Int, Int) -> Int {

    return fun(x1:Int, x2:Int) : Int {
        return x1 + x2
    }
}

fun testOrderFunc2() : (Int, Int) -> Int {
    return {x1:Int, x2:Int -> x1 - x2}
}

fun testOrderFunc3(m1:(Int) -> Int, a1:Int) {
    val r4 = m1(a1)
    println("r4 : $r4")
}

fun testOrderFunc4(a1:Int, a2:Int, m1:(Int, Int) -> Int) {
    val r5 = m1(a1, a2)
    println("r5 : $r5")
}

fun testOrderFunc5(m1:(Int) -> Unit) {
    m1(100)
}