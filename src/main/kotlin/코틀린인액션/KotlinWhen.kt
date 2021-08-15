package 코틀린인액션

import 코틀린인액션.Color.*
import java.lang.IllegalArgumentException

fun main() {

}

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

class KotlinWhen {

    fun getMnemonic(color: Color) =
        when (color) {
            RED -> "Richard"
            ORANGE -> "Of"
            BLUE -> "Battle"
            YELLOW -> "York"
            GREEN -> "Gave"
            INDIGO -> "In"
            VIOLET -> "Vain"
        }

    fun eval(e: Expr): Int =
        when(e) {
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }

    fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }

            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum : $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }
}

enum class Color(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(0, 255, 0), BLUE(0, 0, 255),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}