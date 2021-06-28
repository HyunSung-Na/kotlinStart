package 다양한클래스

fun main() {
    val num1 = 100
    val num2 = 200

    val a1 = num1 + num2
    println("a1 : $a1")
    val a2 = num1.plus(num2)
    println("a2 : $a2")

    val obj1 = TestOperatorClass(100, 200)
    val obj2 = TestOperatorClass(200, 300)

    val obj3 = obj1 + obj2
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")

    val obj4 = obj1 - obj2
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")
}

// 코틀린은 모든 값을 객체로 만들어 관리하기 때문에 코드에 정수를 작성하면 정수로 관리하는 것이 아닌
// 정수 값을 관리하는 객체를 생성하여 객체로 관리한다.
// 그렇기 때문에 더하기 연산 자체가 일반적인 연산으로 동작하지 못한다.
// 코틀린에서는 객체와 객체를 연산자를 통해 연산을 하게 되면 연산을 수행하는 것이 아닌 객체 내의 메서드를 호출한다.
// 호출된 메서드의 객체를 반환 받아 이를 연산의 결과로 사용하게 된다.
class TestOperatorClass(var a1:Int, var a2:Int) {

    operator fun plus(target:TestOperatorClass) : TestOperatorClass {
        val v1 = this.a1 + target.a1
        val v2 = this.a2 + target.a2

        val result = TestOperatorClass(v1, v2)
        return result
    }

    operator fun minus(target: TestOperatorClass) : TestOperatorClass {
        var r1 = this.a1 - target.a1
        val r2 = this.a2 - target.a2

        val result = TestOperatorClass(r1, r2)
        return result
    }
}