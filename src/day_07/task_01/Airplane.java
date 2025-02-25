package day_07.task_01;

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

    /*
    В классе Самолет создать статический метод compareAirplanes, который в
    качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
    сообщение в консоль о том, какой из самолетов длиннее.
     */
    static public void compareAirplanes(Airplane airplane, Airplane airplane2){
        String message = "\nСамолет %s длиннее самолета %s.";
        if (airplane.length > airplane2.length){
            System.out.println(String.format(message, airplane.producer, airplane2.producer));
        } else if (airplane2.length > airplane.length) {
            System.out.println(String.format(message, airplane2.producer, airplane.producer));
        } else {
            System.out.println("\nОба самолета имеют одинаковую длину.");
        }
    }
}