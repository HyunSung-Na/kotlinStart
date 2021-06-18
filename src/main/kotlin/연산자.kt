fun main() {
    val a1:Int = 10
    val a2:Int = -10

    // + 단항 연산자, 양수 -> 양수, 음수 -> 음수
    val r1:Int = +a1
    val r2:Int = +a2

    println("a1 = ${a1}, r1 = $r1")
    println("a2 = $a2, r2 = $r2")

    // - 단항 연산자, 양수 -> 음수, 음수 -> 양수
    val r3:Int = -a1
    val r4:Int = -a2

    println("a1 = $a1, r3 = $r3")
    println("a2 = $a2, r4 = $r4")

    // ! : true -> false, false -> true
    val a3:Boolean = true
    val a4:Boolean = false

    val r5:Boolean = !a3
    val r6:Boolean = !a4

    println("a3 = $a3, r5 = $r5")
    println("a4 = $a4, r6 = $r6")

    // 증감 연산자
    var a5:Int = 10
    var a6:Int = 10

    a5++
    a6--
    println("a5 = $a5, a6 = $a6")

    // IntRange
    val r7:IntRange = 10..20
    println("r7 = $r7")
}