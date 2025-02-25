package day_08;

public class task_01 {
    public static void main(String[] args) {
        int maxLimit = 20000;

        // Вариант 1: Использование String для конкатенации
        long startTimeString = System.nanoTime();
        String resString = "";
        for (int i = 0; i < maxLimit + 1; i++) {
            resString += i + " ";
        }
        long endTimeString = System.nanoTime();
        long resTimeString = endTimeString - startTimeString;
        System.out.println("Время выполнения с использованием String: " + resTimeString + " нс");

        // Вариант 2: Использование StringBuilder для конкатенации
        long startTimeStringBuilder = System.nanoTime();
        StringBuilder resStringBuilder = new StringBuilder();
        for (int i = 0; i < maxLimit + 1; i++) {
            resStringBuilder.append(i).append(" ");
        }
        long endTimeStringBuilder = System.nanoTime();
        long resTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
        System.out.println("Время выполнения с использованием StringBuilder: " + resTimeStringBuilder + " нс");
    }
}