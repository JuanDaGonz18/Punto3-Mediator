package chat;

public interface ChatRoom {
    void registerUser(User user);
    void sendMessage(String msg, User from);
    void sendPrivateMessage(String msg, User from, User to);
    void showHistory();
}
