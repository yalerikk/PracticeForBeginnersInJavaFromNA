package day_016.task_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // Шаг 1: Создание file1.txt
        deleteFileIfExists(file1);
        generateFile1(file1);

        // Шаг 2: Создание file2.txt
        deleteFileIfExists(file2);
        generateAverages(file1, file2);

        // Шаг 3: Вывод суммы вещественных чисел из file2.txt
        printResult(file2);
    }

    private static void deleteFileIfExists(File file) {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Файл '" + file.getName() + "' был удален.");
            } else {
                System.out.println("Не удалось удалить файл '" + file.getName() + "'.");
            }
        }
    }

    private static void generateFile1(File file1) {
        Random random = new Random();
        try (FileWriter writer = new FileWriter(file1)) {
            for (int i = 0; i < 1000; i++) {
                writer.write(random.nextInt(101) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static void generateAverages(File file1, File file2) {
        try (Scanner scanner = new Scanner(file1);
             FileWriter writer = new FileWriter(file2)) {
            double sum = 0;
            int count = 0;

            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;

                if (count == 20) {
                    writer.write((sum / count) + "\n"); // Записываем среднее арифметическое
                    sum = 0; // Сбрасываем сумму для следующей группы
                    count = 0; // Сбрасываем счетчик
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    private static void printResult(File file2) {
        double totalSum = 0;

        try (Scanner scanner = new Scanner(file2)) {
            while (scanner.hasNextLine()) {
                totalSum += Double.parseDouble(scanner.nextLine().trim()); // Прямое добавление к сумме
                // System.out.printf("Считано вещественное число: %.2f%n", totalSum); // Логируем текущую сумму
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }

        System.out.println("\nСумма вещественных чисел: " + (int) totalSum);
    }
}
