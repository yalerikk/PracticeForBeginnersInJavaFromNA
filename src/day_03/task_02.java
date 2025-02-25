package day_03;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        while (true) {
            double divisible = sca.nextDouble(); // делимое
            double divider = sca.nextDouble(); // делитель

            if (divider == 0) {
                System.out.println("На 0 делить - дурак?");
                break;
            }

            System.out.println(divisible / divider);
        }
    }
}