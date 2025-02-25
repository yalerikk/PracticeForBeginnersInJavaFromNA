package day_06.task_03;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();

        Teacher teacher = new Teacher("Василий","физика");
        Student student = new Student("Алексей");

        teacher.evaluate(student, random);
    }
}
