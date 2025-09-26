package chat;

public class ConcreteUser extends User {
    public ConcreteUser(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public void receiveMessage(String msg, User from) {
        System.out.println("[" + name + "] recibido de " + from.getName() + ": " + msg);
    }
}
