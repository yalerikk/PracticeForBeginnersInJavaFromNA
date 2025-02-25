package day_06.task_01;

import static java.lang.Math.abs;

class Car {
    private int yearOfManufacture;
    private String color;
    private String model;

    // конструктор - метод с большой буквы, емае, называется как класс
    public Car(String model, int yearOfManufacture, String color) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color; // this дает понять, что обращаемся к полю и присваиваем ему значение
    } // this дает обратиться к объекту класса вообще, лол

    public void getInfo() {
        System.out.println("\nМашинка " + model + " - " + yearOfManufacture + " года, " +
                color + " цвета");
    }

    public int yearDifference(int year) {
        int res = year - yearOfManufacture;
        return abs(res);
    }
}
