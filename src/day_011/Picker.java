package day_011;

public class Picker implements Worker {
    private double salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(
                warehouse.getCountOrder() + 1
        );
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500) {
            salary *= 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
