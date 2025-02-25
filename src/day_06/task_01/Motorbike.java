package day_06.task_01;

import static java.lang.Math.abs;

class Motorbike {
    private int yearOfManufacture;
    private String color;
    private String model;

    // конструктор - метод с большой буквы, емае, называется как класс
    public Motorbike(String model, int yearOfManufacture, String color) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color; // this дает понять, что обращаемся к полю и присваиваем ему значение
    } // this дает обратиться к объекту класса вообще, лол

    public void getInfo() {
        System.out.println("\nМотоцикл " + model + " - " + yearOfManufacture + " года, " +
                color + " цвета");
    }

    // yearDifference() - принимает на вход число (год), и возвращает разницу между переданным годом и
    // годом выпуска транспортного средства
    public int yearDifference(int year) {
        int res = year - yearOfManufacture;
        return abs(res);
    }
}