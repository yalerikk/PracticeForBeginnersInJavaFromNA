package day_06.task_01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sca.nextInt();

        Car car = new Car("BMWha", 1999, "Black");
        Motorbike motorbike = new Motorbike("Yabi", 2004, "Pink");

        car.getInfo();
        System.out.println("Разница между " +
                "переданным годом и годом выпуска машинки: " + car.yearDifference(year));

        motorbike.getInfo();
        System.out.println("Разница между " +
                "переданным годом и годом выпуска мотика: " + motorbike.yearDifference(year));
    }
}