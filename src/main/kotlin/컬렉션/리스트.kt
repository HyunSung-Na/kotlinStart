package 컬렉션

fun main() {

    // 안에 값을 넣으면 제네릭 생략 가능
    // 하지만 제네릭을 넣는 것을 추천
    val list1 = listOf(10, 20, 30, 40, 50)

    val list2 = listOf<String>("문자열1", "문자열2", "문자열3")

    val list3 = mutableListOf<Int>()
    val list4 = mutableListOf("문자열1", "문자열2", "문자열3")

    // 빈 불변형 리스트
    val list5 = emptyList<Int>()

    // null 을 제외하고 리스트를 만듬
    val list6 = listOfNotNull(10, 20, 30, null, 40, 50, null, 60)

    list3.addAll(listOf(10, 20, 30))
    list3.add(40)

    // toList : 불변형 리스트를 생성해 반환한다.
    // toMutableList : 가변형 리스트를 생성해 반환한다.
    val list100 = list1.toMutableList()
    list100.add(100)

    // 불변형 리스트로 반환, 원본은 변경되지 않는다.
    val list200 = list100.toList()
}

// 배열과 동일하게 인덱스 번호를 통해 객체를 관리한다.
// 배열은 크기가 정해지면 변경할 수 없지만, List 는 추가, 삭제 등이 가능하다.
// listOf : 불변형 리스트 생성
// mutableListOf : 가변형 리스트 생성
// emptyList : 비어있는 불변형 리스트 생성
// listOfNotNull : null 을 제외한 나머지 만으로 리스트를 생성한다.
// 가변형은 메모리를 더 많이 잡아먹고 느리기 때문에 불변형을 추천
// 데이터의 변경이 일어날때는 가변형으로 바꿔서 변경하고 다음에 다시 불변형으로 만드는 것을 추천
