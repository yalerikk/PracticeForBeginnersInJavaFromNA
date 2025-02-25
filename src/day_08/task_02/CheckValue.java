package day_08.task_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckValue {
    protected static int getPositiveIntegerInput(Scanner sca, String message) {
        int value;
        while (true) {
            System.out.print(message);
            try {
                value = sca.nextInt();
                if (value <= 0) {
                    System.out.println("Ошибка: ввод должен быть положительным целым числом.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ввод должен быть целым числом.");
                sca.next(); // Очистка неверного ввода
            }
        }
        return value;
    }

    protected static double getPositiveDoubleInput(Scanner sca, String message) {
        double value;
        while (true) {
            System.out.print(message);
            try {
                value = sca.nextDouble();
                if (value <= 0) {
                    System.out.println("Ошибка: ввод должен быть положительным числом.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ввод должен быть числом.");
                sca.next(); // Очистка неверного ввода
            }
        }
        return value;
    }

    protected static int getYearInput(Scanner sca) {
        int year;
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        while (true) {
            System.out.print("Введите год выпуска самолета (до " + (currentYear + 1) + " года): ");
            try {
                year = sca.nextInt();
                if (year < 1900 || year > currentYear) {
                    System.out.println("Ошибка: год должен быть между 1900 и текущим годом (" + currentYear + ").");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ввод должен быть целым числом.");
                sca.next(); // Очистка неверного ввода
            }
        }
        return year;
    }
}
