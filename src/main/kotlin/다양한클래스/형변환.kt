package 다양한클래스

fun main() {
    var obj1:SubTransClass = SubTransClass()
    var obj2:SubTrans1Class = SubTrans1Class()

    // 부모 클래스 타입 참조변수에 담는다.
    // 스마트 캐스팅 발생
    val super1:SuperTransClass = obj1
    val super2:InterTrans = obj2

    // as : 지정된 클래스 타입으로 강제 변환하는 연산자, 연관성이 있어야 한다.
    super1 as SubTransClass
    super2 as SubTrans1Class

    super1.subMethod()
    super2.subMethod1()

    // is 연산자 : 형변환이 가능하면 변환을 하고 true 를 반환한다.
    // if 문으로 구성하여 사용하며 if 문 내에서만 변환된 타입을 사용하고
    // if 문을 나가게 되면 변환되기 전의 타입으로 다시 변경된다.
    val obj3:SubTrans1Class = SubTrans1Class()
    val obj4:SuperTransClass = SuperTransClass()

    if (obj4 is SubTransClass) {
        // obj4 as SubTransClass
        // is 연산자 값이 true 라면 형변환이 가능한 상황이므로 스마트 캐스팅 발생
        obj4.subMethod()
    }

    val obj7 = SubTransClass()
    val obj8 = SubTrans1Class()

    anyMethod(obj7)
    anyMethod(obj8)

    // kotlin 에서는 기본타입을 관리하는 객체의 타입을 변경하는 메서드를 제공한다.
    // 참조 변수의 타입이 변경되는 것이 아닌 새로운 객체가 생성되어 반환된다.
    val str:String = "100"
    val number:Int = str.toInt()
    println("number : $number")

}

open class SuperTransClass
interface InterTrans

class SubTransClass : SuperTransClass() {
    fun subMethod() {
        println("SubClass 의 SubMethod 입니다.")
    }
}
class SubTrans1Class : InterTrans {
    fun subMethod1() {
        println("SubClass1 의 SubMethod 입니다.")
    }
}

fun anyMethod(obj:Any) {
    if (obj is SubTrans1Class) {
        obj.subMethod1()
        println(obj.javaClass)
    } else if (obj is SubTransClass) {
        obj.subMethod()
        println(obj.javaClass)
    }
}