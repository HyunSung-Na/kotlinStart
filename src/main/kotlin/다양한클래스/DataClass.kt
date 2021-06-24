package 다양한클래스

fun main() {

    val obj = DataClassTest(100, 200)
    val obj1 = DataClassTest(100, 200)

    if (obj.equals(obj1)) {
        println("같은 값을 가진 클래스 입니다.")
    }

    println(obj.toString())
    println(obj1.toString())

    val obj2 = obj.component1()
    val obj3 = obj.component2()

    println("객체 분해 obj2 : $obj2, obj3 : $obj3")
}

// Data Class 는 open, abstract, inner, sealed 클래스로 정의할 수 없다.
// equals, hashCode, toString, copy, componentN 이 생성된다.
// componentN 은 객체 분리를 할 수 있는 기능
// data Class 는 주 생성자를 가지고 있어야 한다.

data class DataClassTest (val a1:Int, val a2:Int) {

    // 내부에 인스턴스 변수로 정의하면 다른 data 로 만들어지는 것에서 제외된다.
    // 주 생성자에서 정의해 주어야 한다.
    var a3 = 100

}
