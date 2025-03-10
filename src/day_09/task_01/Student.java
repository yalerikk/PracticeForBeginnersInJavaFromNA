package day_09.task_01;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void printInfo(){
        super.printInfo(); // Вызов метода printInfo() родительского класса
        System.out.println("Этот студент с именем " + getName());
    }
}
