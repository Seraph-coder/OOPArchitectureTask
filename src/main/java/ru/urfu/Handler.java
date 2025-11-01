package ru.urfu;

/**
 * Обработчик сообщений от пользователя
 */
public class Handler {
    /**
     * Обработать сообщение от пользователя
     */
    public String handle(String messageFromUser) {
        return "Ваше сообщение: '" + messageFromUser + "'";
    }
}
