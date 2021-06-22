package 다양한클래스

fun main() {

    var t1 = GenericTest<Int>()
    t1.testMethod(100)

    var t2 = GenericTest<String>()
    t2.testMethod("제네릭")

    var t3 = GenericTest1<Int, String>()
    t3.testMethod1(100, "테스트")

    var t4 = GenericTest2<Int, String, Long, Double>(100, "테스트")
    t4.TestMethod2(4000, 2.11)
}

// 타입을 동적으로 결정
class GenericTest<T> {

    fun testMethod(a1:T) {
        println("a1 : $a1")
    }
}

class GenericTest1<A, B> {

    // 타입을 두개로 지정해서 서로 다른 타입으로 사용할 수 있다.
    fun testMethod1(a1:A, a2:B) {
        println("a1 : $a1, a2 : $a2")
    }
}

class GenericTest2<A, B, C, D> (var a1:A, var a2: B) {

    fun TestMethod2(a3:C, a4:D) {
        println("a1 : $a1, a2 : $a2, a3 : $a3, a4 : $a4")
    }
}