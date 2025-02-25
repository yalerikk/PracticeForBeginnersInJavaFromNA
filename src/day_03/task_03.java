package day_03;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            double divisible = sca.nextDouble(); // делимое
            double divider = sca.nextDouble(); // делитель

            if (divider == 0) {
                System.out.println("Деление на 0?");
                continue;
            }

            System.out.println(divisible / divider);
        }
    }
}