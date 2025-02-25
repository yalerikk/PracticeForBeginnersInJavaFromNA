package day_05.task_01;

public class task_01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufacture(1999);
        car.setColor("Black");
        car.setModel("BMWha");
        System.out.println("Машинка " + car.getModel() + " - " + car.getYearOfManufacture() + " года, " +
                car.getColor() + " цвета");
    }
}