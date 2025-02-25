package day_08.task_02;

class Airplane {
    private String producer; // producer (изготовитель)
    private int year; // year (год выпуска)
    private double length; // length (длина)
    private double weight; // weight (вес)
    private int fuel; // fuel (количество топлива в баке)

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Airplane(String producer, int year, double length, double weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("\nИзготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " +
                weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
        }
    }

    @Override
    public String toString() {
        return "\nИзготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " +
                weight + ", количество топлива в баке: " + fuel;
    }
}