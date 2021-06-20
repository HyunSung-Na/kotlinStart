package 객체지향

fun main() {

    val obj1:TestClass1 = TestClass1()

    val obj2:TestClass2 = TestClass2(1, 2)

    val obj3:TestClass3 = TestClass3(3, 4)

    val obj4:TestClass4 = TestClass4(200)

}

class TestClass1 {

    init {
        println("객체가 생성될 때 자동으로 동작하는 부분")
    }

    // 멤버 변수
    val a1 = 0
    var a2 = 0

    constructor()

    constructor(a2: Int) {
        this.a2 = a2
    }

    // 멤버 함수
    fun testMethod1() {
        println("테스트함수")
    }
}

// 객체 생성시 생성자
class TestClass2 (var a1:Int, val a2:Int)
class TestClass3 constructor(var a1: Int, val a2: Int)

class TestClass4 (var a1: Int, var a2: Int) {

    // 주 생성자 실행 후 init 실행
    init {
        println("객체 초기 설정")
    }

    // 주 생성자가 있는 경우 주 생성자를 꼭 불러줘야 함
    // 보조 생성자에서는 주생성자가 있을 경우 매개 변수에 var, val 키워드 못씀
    constructor(a1: Int) : this(a1, 100) {
        println("보조 생성자 호출")
    }
}