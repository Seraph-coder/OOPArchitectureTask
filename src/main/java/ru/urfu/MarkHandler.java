package ru.urfu;

/**
 * Простой обработчик сообщений от пользователей
 * <br>
 * Этот обработчик просто возвращает обратно
 * сообщение пользователя, добавляя к нему
 * небольшой текст.
 */
public class MarkHandler implements Handler{
    /**
     * Обработать сообщение от пользователя
     * @param messageFromUser сообщение от пользователя
     * @return ответ бота пользователю
     */
    @Override
    public String handle(String messageFromUser) {
        return "Ваше сообщение: '" + messageFromUser + "'";
    }
}
