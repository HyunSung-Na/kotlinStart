package 컬렉션

fun main() {

    val str1 = "안녕하세요"

    println("str[0] : ${str1[0]}")

    val str2 = str1.substring(1..3)
    println("str2 : $str2")

    var str3 = "Hello World"
    var str4 = "hello world"

    println(str3.compareTo(str4))
    // 대소문자를 가리지 않고 비교
    println(str3.compareTo(str4, true))
    println(str3.contentEquals(str4))

    val str5 = "ab cd ef"
    val r1 = str5.split(" ")
    println("r1 : ${r1}")

    val str6 = "abc"
    val str7 = str6 + "def"
    println("str6 : $str6")
    println("str7 : $str7")

    val buffer1 = StringBuffer()
    buffer1.append("abc")
    buffer1.append(100)

    println("buffer : ${buffer1}")
}

// " " 로 묶어서 관리하는 문자열을 의미한다.
// Kotlin 은 문자열을 Java 와 동일하게 String 클래스의 객체를 생성해서 관리한다.
// Java 와 거의 동일하게 제공되며 몇가지 메서드가 추가되었다.
// Kotlin 은 문자열을 배열의 형태로 관리한다.
// 문자열의 글자를 0부터 시작하는 인덱스 번호로 관리할 수 있어 Java 보다 편리하다.
// 문자열은 불변형으로 가져다 사용하는 것만 가능하다.
// subString : 지정된 범위의 문자열을 반환한다.
// compareTo : 문자열을 비교한다. 같으면 0이며 음수나 양수면 다른 문자열이다. 두번째 값으로 true 를 넣어주면 대소문자를 무시하고 비교한다.
// split : 문자열을 지정된 구분자를 이용해서 잘라낸다.


// StringBuffer
// 문자열은 불변이므로 + 연산자를 통해 문자열을 합치면 문자열 객체가 계속 생성된다.
// StringBuffer 를 사용하면 관리하는 문자열을 직접 조작할 수 있다.
// String 은 지속적인 문자열 연산을 수행하면 메모리를 많이 사용하지만 원본이 유지된다.
// StringBuffer 는 메모리를 줄일 수 있지만 원본을 유지할 수 없다.