package day_07.task_01;

public class Solution {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2020,70.6,30.4,0);
        airplane.info();

        Airplane airplane2 = new Airplane("Airbus", 2019, 70.61, 29.0, 0);
        airplane2.info();

        Airplane.compareAirplanes(airplane, airplane2);
    }
}