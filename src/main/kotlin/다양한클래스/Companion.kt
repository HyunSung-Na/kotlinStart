package 다양한클래스

fun main() {
    CompanionTest.testFunc()

    val obj = CompanionTest()
    obj.testCompanionFunc()
}

class CompanionTest {
    var staticMember = 0

    // 객체를 생성해서 사용할 수는 없다.
    companion object {

        // 자바 코드에서 static 변수를 직접 접근할 수 있도록 해주는 어노테이션
        @JvmStatic var a2 = 1000

        @JvmStatic fun testFunc() {
            println("정적 변수 a2 : $a2")
        }
    }

    fun testCompanionFunc() {
        println("클래스 안에서 정적 변수에 접근할 수 있다. a2 : $a2")
    }
}