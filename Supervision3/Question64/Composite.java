package Question64;

import java.util.ArrayList;
import java.util.Arrays;

public class Composite extends Shape {
    private ArrayList<Shape> component;

    Composite(ArrayList<? extends Shape> component) {
        this.component = (ArrayList<Shape>) component;
    }

    Composite(Shape... component) {
        this.component = new ArrayList<Shape>(Arrays.asList(component));
    }

    Composite() {
        this.component = new ArrayList<Shape>();
    }

    public void addComponent(Shape component) {
        this.component.add(component);
    }

    public void removeComponent(Shape component) {
        this.component.remove(component);
    }

    @Override
    public void draw() {
        for (Shape item : component) {
            item.draw();
        }
    }

}
