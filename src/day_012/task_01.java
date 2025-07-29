package day_012;

import java.util.ArrayList;

public class task_01 {
    public static ArrayList<String> carBrands = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Заполнили список марок автомобилей!\n");
        addCarBrands();
        print();

        carBrands.add(3, "BMW");
        System.out.println("\nДобавили марку " + carBrands.get(3));
        System.out.println("Удаляем марку " + carBrands.get(0) + "\n");
        carBrands.removeFirst();
        print();
    }

    public static void addCarBrands() {
        carBrands.add("Toyota");
        carBrands.add("Ford");
        carBrands.add("Volkswagen");
        carBrands.add("Mercedes-Benz");
        carBrands.add("Honda");
    }

    public static void print() {
        System.out.println("Список марок автомобилей:\n");
        for (int i = 0; i < carBrands.size(); i++) {
            System.out.printf("%s — %d-я марка автомобиля%n", carBrands.get(i), (i + 1));
        }
    }
}