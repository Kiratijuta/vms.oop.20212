package StructuralPattern;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic {

    ArrayList<Graphic> children;

    public CompoundGraphic() {
        children = new ArrayList<Graphic>();
    }

    public CompoundGraphic(ArrayList<Graphic> children) {
        this.children = children;
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(double x, double y) {
        for (Graphic g: children) {
            g.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic g: children) {
            g.draw();
        }
    }
}
