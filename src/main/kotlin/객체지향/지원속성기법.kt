package 객체지향

// 클래스의 속성을 클라이언트에게 노출하고 싶지만 해당 속성을 초기화하거나 읽는 방법을 제어해야 한다.

class Customer(val name: String) {
    private var _messeages: List<String>? = null

    val messages: List<String>
    get() {
        if (_messeages == null) {
            _messeages = loadMessages()
        }
        return _messeages!!
    }

    private fun loadMessages(): MutableList<String> =
        mutableListOf(
            "Initial contact",
            "Convinced them to use Kotlin",
            "Sold training class. Sweet."
        ).also { println("Loaded messages") }
}