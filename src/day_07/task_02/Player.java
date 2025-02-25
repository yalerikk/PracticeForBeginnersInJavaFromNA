package day_07.task_02;

import java.util.Random;

class Player {
    private int stamina; // выносливость
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static Random random = new Random();

    public Player() {
        this.stamina = generateStamina(random);
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public int generateStamina(Random random) {
        return MAX_STAMINA - random.nextInt(11);
    }

    public void run() {
        if (stamina > 0) {
            stamina--;

            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.printf("\nВыносливость достигла %d, игроку нужен отдых и он уходит с поля.\n", stamina);
            }
        }
    }

    public static void info() {
        int freePlaces = 6 - countPlayers;
        if (freePlaces == 1) {
            System.out.printf("\n\nКоманды неполные. На поле еще есть %d свободное место", freePlaces);
        } else if (freePlaces > 1 && freePlaces < 5) {
            System.out.printf("\n\nКоманды неполные. На поле еще есть %d свободных места", freePlaces);
        } else if (freePlaces == 5) {
            System.out.printf("\n\nКоманды неполные. На поле еще есть %d свободных мест", freePlaces);
        } else {
            System.out.print("\nНа поле нет свободных мест");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}