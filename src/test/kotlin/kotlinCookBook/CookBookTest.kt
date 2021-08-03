package kotlinCookBook

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import 객체지향.Customer

class CookBookTest {

    @Test
    fun `load messages`() {

        // 메시지를 처음 로딩
        val customer = Customer("Fred").apply { messages }

        // 메시지에 다시 접근, 로딩됨
        assertEquals(3, customer.messages.size)
    }
}