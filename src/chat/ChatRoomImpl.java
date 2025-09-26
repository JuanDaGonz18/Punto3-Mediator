package chat;

import java.util.*;

public class ChatRoomImpl implements ChatRoom {
    private List<User> users = new ArrayList<>();
    private List<String> history = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
        String systemMsg = "SYSTEM: " + user.getName() + " se unió al chat.";
        history.add(systemMsg);
        System.out.println(user.getName() + " se unió al chat.");
    }

    @Override
    public void sendMessage(String msg, User from) {
        String record = from.getName() + " -> ALL: " + msg;
        history.add(record);
        for (User u : users) {
            if (u != from) {
                u.receiveMessage(msg, from);
            }
        }
    }

    @Override
    public void sendPrivateMessage(String msg, User from, User to) {
        String record = from.getName() + " -> " + to.getName() + ": " + msg;
        history.add(record);
        to.receiveMessage(msg, from);
    }

    @Override
    public void showHistory() {
        System.out.println("\n--- Historial ---");
        for (String h : history) {
            System.out.println(h);
        }
    }
}
