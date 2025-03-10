package day_09.task_02;

public class TestFigures {
    public static void main(String[] args){
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        double sumRedPerimeter = calculateRedPerimeter(figures);
        double sumRedArea = calculateRedArea(figures);

        System.out.printf("Сумма периметров красных фигур: %.2f%nСумма площадей красных фигур: %.2f", sumRedPerimeter, sumRedArea);
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeter = 0;

        for (Figure figure : figures) {
            if ("Red".equalsIgnoreCase(figure.getColor())) {
                sumPerimeter += figure.perimeter(); // Пытаемся рассчитать площадь
            }
        }

        return sumPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;

        for (Figure figure : figures) {
            if ("Red".equalsIgnoreCase(figure.getColor())) {
                sumArea += figure.area(); // Пытаемся рассчитать площадь
            }
        }

        return sumArea;
    }
}