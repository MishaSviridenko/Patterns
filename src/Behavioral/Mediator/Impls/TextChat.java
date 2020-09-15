package Behavioral.Mediator.Impls;

import Behavioral.Mediator.Interfaces.Chat;
import Behavioral.Mediator.Interfaces.User;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUsers(User u) {
        users.add(u);
    }

    public void sendMessage(String message, User user) {
        for (User u : users) {
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}
