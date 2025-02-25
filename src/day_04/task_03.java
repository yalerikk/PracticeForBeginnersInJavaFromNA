package day_04;

import java.util.Random;

public class task_03 {
    public static void main(String[] args) {
        Random rand = new Random();

        // создать массив (матрицу) размером m=12, n=8 (m - размерность по строкам, n - размерность по колонкам)
        int[][] arr = new int[12][8];

        // заполнить его случайными числами от 0 до 50
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(51);
            }
        }

        int maxSum = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }

        System.out.println("Максимальная сумма среди других строк: " + maxSum + ", индекс строки: " + maxIndex);
    }
}