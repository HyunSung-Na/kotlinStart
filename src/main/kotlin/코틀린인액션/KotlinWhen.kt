package 코틀린인액션

import 코틀린인액션.Color.*

fun main() {

}

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
}

enum class Color(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(0, 255, 0), BLUE(0, 0, 255),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}