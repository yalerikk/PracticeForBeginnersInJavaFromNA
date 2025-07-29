package day_013;

public class Test {
    public static User tanos = new User("Tanos");
    public static User minSu = new User("MinSu");
    public static User namSu = new User("NamSu");

    public static void main(String[] args) {
        // Отправить 2 сообщения от пользователя 1 пользователю 2
        tanos.sendMessage(minSu, "Привет, MinSu!");
        tanos.sendMessage(minSu, "Хотел напомнить, что ты до сих пор не вернул мне долг.. У тебя есть время до конца недели.");

        // Отправить 3 сообщения от пользователя 2 пользователю 1
        minSu.sendMessage(tanos, "Привет, Tanos!");
        minSu.sendMessage(tanos, "Плохие новости");
        minSu.sendMessage(tanos, "Я на нуле");

        // Отправить 3 сообщения от пользователя 3 пользователю 1
        namSu.sendMessage(tanos, "Привет, Tanos!");
        namSu.sendMessage(tanos, "Я съел твои конфетки, прости :(");
        namSu.sendMessage(tanos, "Когда ты домой вернешься, я скучаю..");

        // Отправить 3 сообщения от пользователя 1 пользователю 3
        tanos.sendMessage(namSu, "Привет, NamSu!");
        tanos.sendMessage(namSu, "Ничего, новые купим. Пошли погуляем как раз?");
        tanos.sendMessage(namSu, "Я где-то через полчасика буду, собирайся");

        // Отправить 1 сообщение от пользователя 3 пользователю 1
        namSu.sendMessage(tanos, "Ура! Уже побежал :з");

        MessageDatabase.showDialog(tanos, namSu);
    }
}
