package day_02;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во этажей: ");
        Scanner sca = new Scanner(System.in);
        int level = sca.nextInt();

        if (level >= 1 && level <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (level >= 5 && level <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (level >= 9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}