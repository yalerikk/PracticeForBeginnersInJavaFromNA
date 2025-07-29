package day_014.task_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        List<Person> peopleList = parseFileToObjList();
        System.out.println(peopleList);
    }

    public static List<Person> parseFileToObjList() {
        List<Person> result = new ArrayList<>();
        File file = new File("people.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                String[] parts = line.split(" ");

                if (parts.length != 2) {
                    throw new IllegalArgumentException();
                }

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                if (age < 0) {
                    throw new IllegalArgumentException();
                }

                result.add(new Person(name, age));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return result;
    }
}