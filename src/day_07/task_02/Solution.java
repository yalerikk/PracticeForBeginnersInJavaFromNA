package day_07.task_02;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    private static Player[] players = new Player[6];

    public static void main(String[] args) {
        createTeam();
        status();

        fatiguedPlayers(players);
        status();

        if (Player.getCountPlayers() < 6) {
            addPlayers(players);
        }
        status();
    }

    private static void createTeam() {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }

        System.out.println("\t\t\t\t\t\tКоманда собрана!");
    }

    private static void status() {
        Player.info();
        System.out.println("\nКоличество игроков на поле: " + Player.getCountPlayers());
    }

    private static void fatiguedPlayers(Player[] players) {
        int fatiguedPlayers = new Random().nextInt(6) + 1; // 1 - 6

        if (fatiguedPlayers == 1) {
            System.out.printf("\nУстал %d игрок...\n", fatiguedPlayers);
        } else if (fatiguedPlayers == 5) {
            System.out.printf("\nУстают %d игроков...\n", fatiguedPlayers);
        } else {
            System.out.printf("\nУстают %d игрока...\n", fatiguedPlayers);
        }

        // Ограничиваем количество усталых игроков до доступного количества
        fatiguedPlayers = Math.min(fatiguedPlayers, Player.getCountPlayers());

        // Массив для хранения индексов выбранных игроков
        int[] fatiguedIndices = new int[fatiguedPlayers];
        boolean[] selectedPlayers = new boolean[players.length];

        for (int i = 0; i < fatiguedPlayers; i++) {
            int randomI;

            do {
                // генерирует случайное целое число от 0 до Player.getCountPlayers()
                randomI = new Random().nextInt(Player.getCountPlayers());
            } while (selectedPlayers[randomI]);

            selectedPlayers[randomI] = true; // игрок как выбранного
            fatiguedIndices[i] = randomI;

        }

        for (int index : fatiguedIndices) {
            while (players[index] != null && players[index].getStamina() > 0) {
                players[index].run();
            }
        }
    }

    private static void addPlayers(Player players[]) {
        int freePlaces = 6 - Player.getCountPlayers();
        Scanner sca = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.printf("\nВведите количество игроков (макс. %d): ", freePlaces);
            n = sca.nextInt();

            if (n <= 0) {
                System.out.printf("\nИгроков можно добавить (введите число больше нуля): %d", freePlaces);
            } else if (n > freePlaces) {
                System.out.printf("\nНа поле можно добавить только %d игрок%s\n", freePlaces, freePlaces > 1 ? "ов" : "а");
                n = freePlaces;
                break;
            } else {
                break;
            }
        }

        // Добавляем игроков
        for (int i = 0; i < n; i++) {
            players[i] = new Player();
            System.out.printf("\nДобавлен игрок с выносливостью %d.", players[i].getStamina());
        }
    }
}