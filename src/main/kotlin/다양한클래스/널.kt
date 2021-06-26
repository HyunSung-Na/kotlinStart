package 다양한클래스

fun main() {
    // !! null 을 허용하는 변수에 담긴 객체의 주소값을 null 을 허용하지 않는 형태의 값으로 변환
    // !! 은 변환하는 과정에서 null 이 담겨 있으면 에러 발생, 별로 권장하지 않는다, 오류발생
    // testFunc(null) 오류발생
    testFunc("문자열")

    // ?: 연산자는 참조변수에 null 이 들어가 있으면 지정된 기본 값을 반환한다.
    testFunc1(null)

    // ?. 참조 변수를 통해 메서드를 호출하거나 멤버 변수를 이용할 때 참조변수에 주소값이 들어있다면
    // 객체에 접근해서 메서드나 변수를 사용한다. 하지만 null 이 있으면, 오류를 발생 시키지 않고 null 리턴

}

fun testFunc(str:String?) {
    // str 은 null 일 수도 있는데 val에 할당 할 때는 타입이 String 이기 때문에 오류 발생
    // 이를 !! 로 널 허용이 될 수 있도록 설정
    val value:String = str!!
}

fun testFunc1(str:String?) {

    val value1:String = str?: "기본 문자열"
    println("value : $value1")
}

fun testFunc2(str:String?) {

    println("value : ${str?.length}")
}