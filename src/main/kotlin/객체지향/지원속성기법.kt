package 객체지향

// 클래스의 속성을 클라이언트에게 노출하고 싶지만 해당 속성을 초기화하거나 읽는 방법을 제어해야 한다.

class Customer(val name: String) {
    // Lazy 대리자 함수 사용, 지연로딩
    val messeages: List<String> by lazy { loadMessages() }

    private fun loadMessages(): MutableList<String> =
        mutableListOf(
            "Initial contact",
            "Convinced them to use Kotlin",
            "Sold training class. Sweet."
        ).also { println("Loaded messages") }
}

class Task(val name: String, _priority: Int = DEFAULT_PRIORITY) {

    companion object {
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

    var priority = validPriority(_priority)
        set(value) {
            field = validPriority(value)
        }

    private fun validPriority(p: Int) =
        p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)
}