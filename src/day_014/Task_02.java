package day_014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        List<String> peopleList = parseFileToStringList();
        System.out.println(peopleList);
    }

    public static List<String> parseFileToStringList() {
        List<String> result = new ArrayList<>();
        File file = new File("people.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length != 2) {
                    throw new IllegalArgumentException();
                }

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                if (age < 0) {
                    throw new IllegalArgumentException();
                }

                result.add(name + " " + age);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return result;
    }
}