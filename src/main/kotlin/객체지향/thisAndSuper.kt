package 객체지향

fun main() {
    var obj = TestThisClass()
    obj.testMethod()
}

open class TestThisClass(var a2:Int){

    open var a1 = 100

    constructor() : this(100) {

    }

    fun testMethod() {
        var a1 = 200

        // 메서드 안에서는 메서드 변수가 우선으로 출력 하지만 this 를 사용하면 class 의 멤버 변수가 출력됨
        println("a1 : ${this.a1}")
        println("a2 : ${this.a2}")
    }
}

class SubThisClass : TestThisClass(100) {

    // 부모 클래스의 멤버 변수를 바꿀 때 사용 부모 클래스에서는 open 을 써야한다.
    override var a1 = 200

    fun subMethod() {
        println("a1 : ${this.a1}")
        println("superA1 : ${super.a1}")
    }
}

class SubThisClass2 : TestThisClass {

    // 주 생성자에서 부모 생성자를 호출하지 않았다면 보조 생성자에서 호출해도 된다
    constructor(a2: Int) : super(a2) {

    }
}