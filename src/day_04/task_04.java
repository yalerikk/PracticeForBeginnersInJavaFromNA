package day_04;

import java.util.Random;

public class task_04 {
    public static void main(String[] args) {
        Random rand = new Random();

        // создать массив (матрицу) массив размера 100
        int[] arr = new int[10];

        // заполнить его случайными числами от 0 до 10000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10001);
        }

        int maxSum = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }

        System.out.println("Максимальная сумма тройки: " + maxSum + ", индекс" +
                " первого элемента тройки: " + maxIndex);
    }
}