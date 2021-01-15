package Question64;

public class Frame extends Decorator {

    Frame(Shape wrapee) {
        super(wrapee);
    }

    @Override
    public void draw() {
        wrapee.draw();
        System.out.println("A frame");
    }

}
