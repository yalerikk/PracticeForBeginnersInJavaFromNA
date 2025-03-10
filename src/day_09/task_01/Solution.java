package day_09.task_01;

public class Solution {
    public static void main(String[] args){
        Student student = new Student("Анна", "Группа 210902");
        System.out.printf("\nНазвание учебной группы у студента %s - %s%n", student.getName(), student.getGroupName());
        student.printInfo();

        Teacher teacher = new Teacher("Павел", "Физкультура");
        System.out.printf("\nНазвание предмета у преподавателя %s - %s%n", teacher.getName(), teacher.getSubjectName());
        teacher.printInfo();
    }
}