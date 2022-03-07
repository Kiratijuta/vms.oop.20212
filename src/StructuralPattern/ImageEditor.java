package StructuralPattern;

import java.util.ArrayList;

public class ImageEditor {

    public static void main(String[] args) {

        CompoundGraphic compound = new CompoundGraphic();

        Graphic d1 = new Dot(10, 15);
        Graphic d2 = new Dot(5, 30);
        Graphic c1 = new Circle(22, 11, 9);
        compound.add(d1);
        compound.add(c1);
        compound.add(d2);

        ArrayList<Graphic> items = new ArrayList<Graphic>();
        Graphic d3 = new Dot(10, 15);
        Graphic d4 = new Dot(5, 30);
        Graphic c2 = new Circle(22, 11, 9);
        items.add(d3);
        items.add(d4);
        items.add(c2);

        Graphic cg = new CompoundGraphic(items);
        compound.add(cg);

        compound.draw();
        compound.move(6, 2);

    }
}
