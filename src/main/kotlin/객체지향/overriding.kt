package 객체지향

fun main() {

    val obj1:SubClass1 = SubClass1()
    println("obj1.subA2 : ${obj1.subA2}")
    obj1.subMethod2()

    println("obj1.superA1 : ${obj1.superA1}")
    obj1.superMethod1()

    // 타입이 부모 클래스이기 때문에 부모 클래스 변수와 메서드에만 접근 할 수 있다.
    val obj2:SuperClass1 = obj1
    println("obj2.superA1 : ${obj2.superA1}")
    obj2.superMethod1()

    // 메서드 오버라이딩
    val obj3:SubClass22 = SubClass22()

    obj3.superMethod2()

    // 부모클래스 타입에서도 자식 클래스의 오버라이트 된 메서드를 사용할 수 있다.
    val obj4:SuperClass22 = obj3

    obj4.superMethod2()

    println("-------------------------------------------------------------------")

    val obj5:SuperClass33 = SuperClass33()
    overridingTest(obj5)

    val obj6:SubClass33 = SubClass33()
    overridingTest(obj6)
}

open class SuperClass1{

    var superA1 = 100

    fun superMethod1() {
        println("SuperClass1의 superMethod1 입니다.")
    }
}

class SubClass1 : SuperClass1() {

    var subA2 = 200

    fun subMethod2() {
        println("SubClass1의 subMethod1 입니다.")
    }
}

open class SuperClass22 {

    // open 키워드로 sub 클래스에서 오버라이드가 가능하도록 설정
    open fun superMethod2() {
        println("SuperClass22의 superMethod2")
    }
}

class SubClass22 : SuperClass22() {

    override fun superMethod2() {
        println("SubClass22의 superMethod2")
    }
}

open class SuperClass33 {

    open fun superMethod3() {
        println("SuperClass3의 superMethod3")
    }
}

fun overridingTest(obj1:SuperClass33) {
    obj1.superMethod3()
}

class SubClass33 : SuperClass33() {

    override fun superMethod3() {
        println("SubClass3의 superMethod3")
    }
}