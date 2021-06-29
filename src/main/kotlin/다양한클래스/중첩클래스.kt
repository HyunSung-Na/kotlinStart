package 다양한클래스

fun main() {

    val obj = Outer1()
    val obj2 = obj.Inner1()
    obj2.innerMethod1()

    val obj3 = object : AbstractOuter() {
        override fun testMethod() {
            println("익명 중첩 클래스 테스트 메서드")
        }
    }

    obj3.testMethod()

    val obj4 = object : InterfaceOuter {
        override fun interMethod() {
            println("익명 중첩 클래스 테스트")
        }
    }

    obj4.interMethod()
}

// 외부 클래스를 생성해도 내부 클래스를 생성하지 않으면 내부 클래스를 사용할 수 없다.
class Outer1 {

    val outerMember = 100

    fun outerMethod() {
        println("Outer Method")
    }

    // 내부 클래스 안에서는 외부 클래스의 내부 멤버를 자유롭게 접근 가능
    // 하지만 외부 클래스에서는 내부 클래스의 함수나 멤버 변수를 사용할 수 없다.
    // 외부 클래스가 생성되어도 내부 클래스가 생성되었다는 보장이 없기 때문
    inner class Inner1 {

        val innerMember = 200

        fun innerMethod() {
            println("Inner Class method")
        }

        fun innerMethod1() {
            println("outerMember : $outerMember")
            outerMethod()
        }
    }
}

abstract class AbstractOuter {
    abstract fun testMethod()
}

interface InterfaceOuter {
    fun interMethod()
}