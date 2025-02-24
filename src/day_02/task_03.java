package day_02;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();

        if (a >= b || b - a < 5) {
            System.out.println("Некорректный ввод");
            return;
        }

        int i = a + 1;

        while (i < b) {
            if (i % 5 == 0 && !((i % 10) == 0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}