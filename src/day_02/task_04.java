package day_02;

import java.util.Scanner;
import static java.lang.Math.pow;

public class task_04 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double x = sca.nextDouble();
        double y;

        if (x >= 5) {
            y = (pow(x, 2) - 10) / (x + 7);
        } else if (x > -3) { // объединила условия x > -3 && x < 5 в одно условие x > -3
            y = (x + 3) * (pow(x, 2) - 2);
        } else {
            y = 420;
        }

        System.out.println(y);
    }
}