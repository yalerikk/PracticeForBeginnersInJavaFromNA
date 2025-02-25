package day_08.task_02;

import java.util.Scanner;

import static day_08.task_02.CheckValue.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        Airplane airplane = new Airplane("Boeing",2020,70.6,30.4,0);
        airplane.info();

        int inputFuel = getPositiveIntegerInput(sca, "\nВведите число для заправки топливного бака самолета на это значение: ");
        int inputYear = getYearInput(sca);
        double inputLength = getPositiveDoubleInput(sca, "\nВведите длину самолета (не забудьте, что ввод через запятую для дробной части): ");

        airplane.fillUp(inputFuel);
        airplane.setYear(inputYear);
        airplane.setLength(inputLength);

        System.out.println(airplane);

        int inputSecondFuel = getPositiveIntegerInput(sca, "\nВведите второе число для заправки топливного бака самолета на это значение: ");
        airplane.fillUp(inputSecondFuel);

        System.out.println(airplane);
    }
}