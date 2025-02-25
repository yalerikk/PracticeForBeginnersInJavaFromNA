package day_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Random rand = new Random();
        int n = sca.nextInt();

        // создать массив указанного размера
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            // заполнить его случайными числами от 0 до 10
            arr[i] = rand.nextInt(11);
        }

        int moreThanEight = 0;
        int equalToOne = 0;
        int evenNum = 0;
        int oddNum = 0;
        int sum = 0;

        for (int x:arr) {
            // Количество чисел больше 8
            if (x > 8) {
                moreThanEight++;
            }
            // Количество чисел равных 1
            if (x == 1) {
                equalToOne++;
            }
            // Количество четных чисел
            if (x % 2 == 0) {
                evenNum++;
            }
            // Количество нечетных чисел
            if (!(x % 2 == 0)) {
                oddNum++;
            }
            // Сумма всех элементов массива
            sum = sum + x;
        }

        System.out.println("Введено число: " + n + " Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Информация о массиве:\nДлина массива: " + arr.length);
        System.out.printf("Количество чисел больше 8: %d\nКоличество чисел равных 1: %d\nКоличество четных чисел: " +
                        "%d\nКоличество нечетных чисел: %d\nСумма всех элементов массива: %d", moreThanEight, equalToOne,
                evenNum, oddNum, sum);
    }
}