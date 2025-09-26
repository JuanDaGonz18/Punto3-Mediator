package chat;

public abstract class User {
    protected String name;
    protected ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg) {
        chatRoom.sendMessage(msg, this);
    }

    public void sendPrivate(String msg, User to) {
        chatRoom.sendPrivateMessage(msg, this, to);
    }

    public abstract void receiveMessage(String msg, User from);
}
