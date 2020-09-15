package Behavioral.Mediator.Impls;

import Behavioral.Mediator.Interfaces.Chat;
import Behavioral.Mediator.Interfaces.User;

public class SimpleUser implements User {
    Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println("user took a message." + message + ", ");
    }
}
