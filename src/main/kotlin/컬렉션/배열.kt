package 컬렉션

fun main() {
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1 : ${array1.contentToString()}")

    // 다양한 타입의 자료형들을 담을 수 있다.
    // 권장하지 않는다.
    val array2 = arrayOf(100, 1.1, "문자열", true)
    println("array2 : ${array2.contentToString()}")

    // 각각의 기본 자료형에 맞는 배열로 만들 수도 있다.
    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = arrayOf<String>("문자열", "만", "올수있다.")
    println("array3, array4 : ${array3.contentToString()}, ${array4.contentToString()}")

    val array5 = Array(5, {0})
    println("array5 : ${array5.contentToString()}")

    val array6 = Array(5) {it * 2}
    println("array6 : ${array6.contentToString()}")

    for (item in array6) {
        println("for 문 : item : ${item}")
    }

    val array7 = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println("array7 : ${array7.contentDeepToString()}")

    println("array6 : 첫번째 인덱스 ${array6[0]}, 두번째 인덱스 ${array6.get(1)}")

    array1[0] = 100
    array1.set(1, 200)
    println("array1 : ${array1.contentToString()}")
    println("array1 size : ${array1.size}")

    val array8 = arrayOf(1, 3, 4, 5, 2, 10, 7, 9, 8)
    val array9 = array8.sortedArray()
    val array10 = array9.sortedArrayDescending()

    println("array sort : ${array9.contentToString()}")
    println("array deSending sort : ${array10.contentToString()}")

    // 제공 메서드 들
    // plus : 요소를 추가한 새로운 배열을 만들어 반환
    // spliceArray : 지정된 범위의 요소를 관리하는 배열을 만들어 반환한다.
    // first : 제일 앞의 값을 반환한다.
    // last : 제일 마지막 값을 반환한다.
    // indexOf : 지정된 값의 인덱스를 반환한다.
    // average : 평균 값을 반환한다.
    // sum : 합계를 구한다.
    // contains 값을 포함하는지 여부
    // max 최대, min 최소값
    // 값 in 배열 값이 배열에 있는지 여부

}
