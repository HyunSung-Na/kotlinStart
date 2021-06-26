package 다양한클래스

fun main() {

    testMethod("문자열")

    testMethod1("널 방어")
    testMethod1(null)
}

fun testMethod(str:String?) {

    println(str?.length)

    // 널이 아닌 것이 String 클래스 인지로 확인 되었기 때문에 사용가능
    if (str is String) {
        // 스마트 캐스팅 발생
        println(str.length)
    }
}

fun testMethod1(str:Any?) {
    if (str is String) {
        println(str.length)
    }
}