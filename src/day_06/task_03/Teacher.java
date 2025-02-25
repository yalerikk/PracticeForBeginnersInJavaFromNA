package day_06.task_03;

import java.util.Random;

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student, Random random) {
        int min = 2;
        int max = 5;

        int score = random.nextInt(max - min + 1) + min; // Случайное число от 2 до 5

        System.out.printf("Преподаватель %s оценил студента с именем %s " +
                "по предмету %s на оценку ", name, student.getStudentName(), subject);

        switch (score) {
            case 2:
                System.out.println("неудовлетворительно(2).");
                break;
            case 3:
                System.out.println("удовлетворительно(3).");
                break;
            case 4:
                System.out.println("хорошо(4).");
                break;
            case 5:
                System.out.println("отлично(5).");
                break;
        }
    }
}