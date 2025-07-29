package day_013;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() {
        return new ArrayList<>(messages);
    }

    public static void showDialog(User u1, User u2) {
        System.out.printf("Диалог между %s и %s :\n\n", u1.getUsername(), u2.getUsername());

        for (Message message : messages) {
            if ((message.getSender().equals(u1) && message.getReceiver().equals(u2)) ||
                    (message.getSender().equals(u2) && message.getReceiver().equals(u1))) {
                System.out.println(message.getSender().getUsername() + ": " + message.getText());
            }
        }
    }
}
