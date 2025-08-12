package day_018;

public class Task_02 {
    public static void main(String[] args) {
        int number = 717771237;
        System.out.println(count(number));
    }

    private static int count(int number) {
        if (number == 0)
            return 0;

        // number % 10 – Получаем последнюю цифру числа
        return (number % 10 == 7 ? 1 : 0) + count(number / 10);
    }
}
