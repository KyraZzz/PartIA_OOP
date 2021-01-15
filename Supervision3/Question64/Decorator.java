package Question64;

public class Decorator extends Shape {

    protected Shape wrapee;

    Decorator(Shape wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void draw() {
        wrapee.draw();
    }

}
