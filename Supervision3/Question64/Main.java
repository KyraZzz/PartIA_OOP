package Question64;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Question (b)
        Shape circle1 = new Circle();
        Shape rect1 = new Rectangle();
        Shape[] arr = { circle1, rect1 };
        ArrayList<Shape> shapeList = new ArrayList<>(Arrays.asList(arr));

        System.out.println("For question B:");

        int cnt = 0;
        while (cnt < 5) {
            System.out.println("Time:" + cnt);
            for (Shape item : shapeList) {
                item.draw();
            }
            TimeUnit.SECONDS.sleep(1);
            cnt++;
        }

        // Question (c)
        Composite set1 = new Composite(shapeList);

        Shape circle2 = new Circle();
        Shape circle3 = new Rectangle();
        Composite set2 = new Composite(circle2, circle3);

        Composite set3 = new Composite();
        set3.addComponent(set1);
        set3.addComponent(set2);

        System.out.println("For question C:");
        set3.draw();

        // Question (d)
        System.out.println("For question D:");
        Shape shape1 = new Frame(new Circle());
        Shape shape2 = new RoundFrame(new Rectangle());
        shape1.draw();
        shape2.draw();
    }
}
