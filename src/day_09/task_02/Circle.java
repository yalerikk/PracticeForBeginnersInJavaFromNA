package day_09.task_02;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


class Circle extends Figure{
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}