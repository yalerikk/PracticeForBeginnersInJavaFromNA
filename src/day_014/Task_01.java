package day_014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int count = 0;

            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }

            scanner.close();

            if (count != 10) {
                throw new IllegalArgumentException();
            }

            System.out.println("Сумма чисел: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}