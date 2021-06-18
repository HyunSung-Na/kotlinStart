fun main() {
    var a1:Int = 10

    // if 문

    if (a1 == 10) {
        println("a1은 10입니다.")
    } else {
        println("a1은 10이 아닙니다")
    }

    var a5:String = if (a1 == 10) "10입니다." else "10이 아닙니다."

    a5 = if (a1 == 10) {
        "10"
    } else {
        "10이 아니다"
    }

    // when
    var b1 = 2

    when (b1) {
        1 -> println("b1은 1입니다.")
        2 -> println("b1은 2입니다.")
        3 -> {
            println("2줄이상일 때는 블록으로")
            println("하면 됩니다.")
        }
        else -> println("b1은 1, 2, 3 이 아닙니다.")
    }

    val b2 = 4

    when (b2) {
        in 1..4 -> println("b2은 1이상 4이하에 포함됩니다.")
        else -> println("4이상의 수입니다.")
    }

    val value = setValue(1)

}

fun setValue(a1:Int) = when (a1) {
    1 -> "문자열1"
    2 -> "문자열2"
    else -> "아무것도 아니다"
}