package 컬렉션

fun main() {
    val set1 = setOf<Int>(10, 20, 30, 40)

    val set2 = setOfNotNull(10, 20, null, 30, 40)

    val set3 = set2.toMutableSet()
    set3.add(50)
}

