package chat;

public class Main {
    public static void main(String[] args) {
        ChatRoomImpl chat = new ChatRoomImpl();

        User alice = new ConcreteUser("Alice", chat);
        User bob = new ConcreteUser("Bob", chat);
        User carol = new ConcreteUser("Carol", chat);

        chat.registerUser(alice);
        chat.registerUser(bob);
        chat.registerUser(carol);

        alice.sendMessage("Hola a todos!");
        bob.sendPrivate("Hola Alice, ¿cómo estás?", alice);
        carol.sendMessage("Hola grupo!");

        chat.showHistory();
        System.out.println("\n--- Chat terminado ---");
    }
}
