package StructuralPattern;

public class Dot implements Graphic {

    double x = 0.0;
    double y = 0.0;

    Dot() { }

    Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double x, double y) {
        System.out.println("Dot.move called");
    }

    @Override
    public void draw() {
        System.out.println("Dot.draw called");
    }
}
