package StructuralPattern;

public class Circle extends Dot {

    double radius = 0.0;

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw called");
    }
}
