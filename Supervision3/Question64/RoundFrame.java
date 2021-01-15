package Question64;

public class RoundFrame extends Decorator {

    RoundFrame(Shape wrapee) {
        super(wrapee);
    }

    @Override
    public void draw() {
        wrapee.draw();
        System.out.println("Draw a round frame.");
    }

}
