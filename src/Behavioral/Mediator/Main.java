package Behavioral.Mediator;

import Behavioral.Mediator.Impls.Admin;
import Behavioral.Mediator.Impls.SimpleUser;
import Behavioral.Mediator.Impls.TextChat;
import Behavioral.Mediator.Interfaces.User;

/**
 * Определяет объект, инкапсулирующий способ взаимодействия множества
 * объектов. Посредник обеспечивает слабую связанность системы,
 * избавляя объек ты от необходимости явно ссылаться друг на друга
 * и позволяя тем самым незави симо изменять взаимодействия между ними.
 * <p>
 * Посредник - инкапсулирует взаимодействие совокупности объектов
 * в отдельный объект-посредник. Уменьшает степень связанности
 * взаимодействующих объектов - им не нужно хранить ссылки друг на
 * друга. Т.о. в паттерне есть Client(Client  - интерфейс имеющий
 * несколько реализаций) который отправляет сообщения в чат
 * (чат - Mediator (интерфейс) имеющий несколько реализаций,
 * т.е. чатов может быть несколько), а чат уже решает кому это
 * сообщение показать (например, только тем людям которые в этом
 * чате зарегистрированы).
 * Т.о. каждый чат имеет список пользователей метод отправки
 * сообщения которое он отправит всем кто есть в списке пользователей.
 * И каждый пользователь имеет список чатов и метод отправки сообщения.
 */
public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User u1 = new SimpleUser(chat);
        User u2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUsers(u1);
        chat.addUsers(u2);

        u1.sendMessage("Hi, i'm usser! ");
        admin.sendMessage("Admin entered chat");
    }
}
