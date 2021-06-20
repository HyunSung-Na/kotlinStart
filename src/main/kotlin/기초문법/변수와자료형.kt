fun main() {

    // 정수 리터럴
    println(100)

    // 21억이 넘어가도 L을 붙이지 않아도 Java로 변환될때 자동으로 L이 붙는다.
    println(100000000000000000)

    // 실수 리터럴 F를 붙이지 않으면 double 로 되고 8바이트, F 붙이면 4바이트
    println(11.11)
    println(22.22F)

    // 문자열 리터럴
    println('A')
    println('가')
    println("문자열")

    // boolean
    println(true)
    println(false)

    // 문자열 Raw String
    println("동해물과 백두산이 \n 마르고 닳도록\n 하느님이 보우하사 \n 우리나라 만세")
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())

    // 변수 선언 val 은 불변, 형을 명시하지 않으면 자동으로 판단, 코틀린은 생략을 권장
    val a1:Int = 100
    println("a1 : ${a1}")

    // var 는 가변
    var a2 = 100
    println("a2 : $a2")

    // null 을 허용하는지 안하는지 ?를 붙이면 null 허용
    var a3 = 100
    var a4:Int? = null

    println("a3 : $a3")
    println("a4 : $a4")
}