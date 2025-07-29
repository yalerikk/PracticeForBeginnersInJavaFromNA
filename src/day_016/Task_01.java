package day_016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int count = 0;

            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }

            scanner.close();

            if (count == 0) {
                System.out.println("Нет чисел для вычисления.");
                return;
            }

            double average = (double) sum / count;

            System.out.printf("Среднее арифметическое чисел: %.10f;\n", average); // Полная запись
            System.out.printf("Сокращенная запись (3 знака после запятой): %.3f;\n", average);
            System.out.printf("\nСумма чисел: %d; Количество чисел: %d.\n", sum, count);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}