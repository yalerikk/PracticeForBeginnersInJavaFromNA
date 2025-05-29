package day_011;

public class Solution {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println("\nStart of job:");
        System.out.println("\n" + warehouse + "\n" + picker + "\n" + courier);

        for (int i = 0; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println("\nProcess of job:");
        System.out.println("\n" + warehouse + "\n" + picker + "\n" + courier);

        picker.bonus();
        courier.bonus();

        System.out.println("\nBonus:");
        System.out.println("\n" + warehouse + "\n" + picker + "\n" + courier);

        // ------ Дополнительное задание ------
        Warehouse secondWarehouse = new Warehouse();
        Picker secondPicker = new Picker(secondWarehouse);
        Courier secondCourier = new Courier(secondWarehouse);

        System.out.println("\nStart of job in secondWarehouse:");
        System.out.println("\n" + secondWarehouse + "\n" + secondPicker + "\n" + secondCourier);

        secondPicker.doWork();
        secondCourier.doWork();

        System.out.println("\nProcess of job in secondWarehouse:");
        System.out.println("\n" + secondWarehouse + "\n" + secondPicker + "\n" + secondCourier);

        System.out.println("\n\t\t ------ Final Statistics -------");
        System.out.print("\nFirst warehouse:");
        System.out.println("\n" + warehouse + "\n" + picker + "\n" + courier);
        System.out.print("\nSecond warehouse:");
        System.out.println("\n" + secondWarehouse + "\n" + secondPicker + "\n" + secondCourier);
    }
}
