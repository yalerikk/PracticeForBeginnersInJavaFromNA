package day_04;

import java.util.Arrays;
import java.util.Random;

public class task_02 {
    public static void main(String[] args) {
        Random rand = new Random();

        int max = 0;
        int min = 10001;
        int countEndsWithZero = 0;
        int sumEndsWithZero = 0;

        // создать массив размера 100
        int[] arr = new int[100];

        // заполнить его случайными числами от 0 до 10000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10001);
        }

        // находим наибольший и наименьший элементы
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // считаем количество и сумму элементов, оканчивающихся на 0
        for (int num : arr) {
            if (num % 10 == 0) {
                countEndsWithZero++;
                sumEndsWithZero += num;
            }
        }

        System.out.println("Массив: " + Arrays.toString(arr) + "\nНаибольший элемент массива: " + max +
                "\nНаименьший элемент массива: " + min + "\nКоличество элементов массива, оканчивающихся на 0: " +
                countEndsWithZero + "\nСумма элементов массива, оканчивающихся на 0: " + sumEndsWithZero);
    }
}