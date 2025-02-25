package day_05.task_02;

class Motorbike {
    private int yearOfManufacture;
    private String color;
    private String model;

    public Motorbike(String model, int yearOfManufacture, String color) { // конструктор - метод с большой буквы, емае, называется как класс
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color; // this дает понять, что обращаемся к полю и присваиваем ему значение
    } // this дает обратиться к объекту класса вообще, лол

    public void getInfo() {
        System.out.println("Мотоцикл " + model + " - " + yearOfManufacture + " года, " +
                color + " цвета");
    }
}