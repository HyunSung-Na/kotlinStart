import 객체지향.TestClass4

fun main() {
    val a1 = 1..10

    for (item in a1) {
        println("a1 : $item")
    }

    println()

    // step 후 2 증가씩
    val a2 = 1..10 step 2

    for (item in a2) {
        println("a2 : $item")
    }

    println()

    // 감소하는 관리 객체
    val a3 = 10 downTo 1 step 2

    for (item in a3) {
        println("a3 : $item")
    }

    println()

    var a4 = 0

    while (a4 < 10) {
        println("a4 : $a4")

        a4++
    }

    println()

    var a5 = 0

    do {
        println("a5 : $a5")
        a5++
    } while (a5 < 10)

    val obj = TestClass4(100)
}