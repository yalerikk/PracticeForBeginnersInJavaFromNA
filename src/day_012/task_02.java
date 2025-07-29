package day_012;

import java.util.ArrayList;

public class task_02 {
    public static ArrayList<Integer> evenNumbers = new ArrayList<>();

    public static void main(String[] args) {
        fillList(0, 30);
        fillList(300, 350);
        print();
    }

    public static void fillList (int firstNumber, int lastNumber) {
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
    }

    public static void print() {
        System.out.println("Список чисел:\n");
        for (Integer evenNumber : evenNumbers) {
            if (evenNumber.equals(evenNumbers.getLast())) {
                System.out.printf("%s.\n", evenNumber);
            } else {
                System.out.printf("%s, ", evenNumber);
            }
        }
    }
}