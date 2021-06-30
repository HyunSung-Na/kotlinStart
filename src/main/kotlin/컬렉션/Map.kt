package 컬렉션

fun main() {
    val map1 = mapOf<String, Int>("key1" to 10, "key2" to 20)

    println("map1 : $map1")

    val map2 = mutableMapOf<String, Int>()
    println("map2 : $map2")

    // 값 타입이 여러개인 경우는 Any 타입으로 정의
    val map3 = mapOf<String, Any>()

    println("map1 : ${map1.get("key1")}")
    println("map1 : ${map1["key1"]}")
}

// size : 관리하는 요소 개수
// keys : key 를 배열로 반환한다.
// values : 객체들을 배열로 반환한다.
// containsKey : 지정된 이름으로 저장된 객체가 있는지 확인한다.
// containValues : 지정된 값으로 저장된 객체가 있느지 확인한다.

// 가변형의 경우 put, remove 를 사용할 수 있다.