package day_06.task_02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        Airplane airplane = new Airplane("Boeing",2020,70.6,30.4,0);
        airplane.info();

        System.out.print("\nВведите число для заправки топливного бака самолета на это значение: ");
        int inputFuel = sca.nextInt();
        System.out.print("Введите год выпуска самолета: ");
        int inputYear = sca.nextInt();
        System.out.print("Введите длину самолета (не забудь, что ввод через запятую для дробной части): ");
        double inputLength = sca.nextDouble();

        airplane.fillUp(inputFuel);
        airplane.setYear(inputYear);
        airplane.setLength(inputLength);

        airplane.info();

        System.out.print("\nВведите второе число для заправки топливного бака самолета на это значение: ");
        int inputSecondFuel = sca.nextInt();
        airplane.fillUp(inputSecondFuel);

        airplane.info();
    }
}