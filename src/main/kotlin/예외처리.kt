import java.lang.ArithmeticException

fun main() {
    try {
        val a1 = 10 / 0
    } catch (e:ArithmeticException) {
        println("수학적 오류가 발생하였습니다.")
    } finally {
        println("무조건 수행")
    }
}