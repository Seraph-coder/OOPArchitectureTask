import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.urfu.Handler;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для класса MarkHandler
 */
class HandlerTest {
    private Handler handler;

    @BeforeEach
    void setUp() {
        handler = new Handler();
    }
    /**
     * Тестирует метод handle класса MarkHandler на корректность возвращаемого ответа
     * в случае, когда входящее сообщение не пустое.
     */
    @Test
    void handleReturnsExpectedResponseWithInputMessage() {
        assertEquals("Ваше сообщение: 'привет'", handler.handle("привет"));
    }

    /**
     * Тестирует метод handle класса MarkHandler на корректность возвращаемого ответа
     * в случае, когда входящее сообщение пустое.
     */
    @Test
    void handleReturnsExpectedResponseWithoutInputMessage() {
        assertEquals("Ваше сообщение: ''", handler.handle(""));
    }
}