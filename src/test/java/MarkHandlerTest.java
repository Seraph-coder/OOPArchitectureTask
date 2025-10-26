import org.junit.jupiter.api.Test;
import ru.urfu.Handler;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для класса MarkHandler
 */
class MarkHandlerTest {
    /**
     * Тестирует метод handle класса MarkHandler на корректность возвращаемого ответа
     * в случае, когда входящее сообщение не пустое.
     */
    @Test
    void handleReturnsExpectedResponseWithInputMessage() {
        Handler handler = new ru.urfu.MarkHandler();
        String inputMessage = "Hello, Bot!";
        String expectedResponse = "Ваше сообщение: 'Hello, Bot!'";
        String actualResponse = handler.handle(inputMessage);
        assertEquals(expectedResponse, actualResponse);
    }

    /**
     * Тестирует метод handle класса MarkHandler на корректность возвращаемого ответа
     * в случае, когда входящее сообщение пустое.
     */
    @Test
    void handleReturnsExpectedResponseWithoutInputMessage() {
        Handler handler = new ru.urfu.MarkHandler();
        String inputMessage = "";
        String expectedResponse = "Ваше сообщение: ''";
        String actualResponse = handler.handle(inputMessage);
        assertEquals(expectedResponse, actualResponse);
    }
}