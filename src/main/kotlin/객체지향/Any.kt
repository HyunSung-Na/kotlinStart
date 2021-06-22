package 객체지향

fun main() {

    val obj1 = AnyClassTest()
    println("obj1 : ${obj1}")
}


// 모든 class 는 Any 를 조상으로 가지고 있는데, 거기서 toString 을 오버라이드 해서 사용할 수 있다.
class AnyClassTest {

    override fun toString(): String {
        return "AnyClassTest의 객체 입니다."
    }

}