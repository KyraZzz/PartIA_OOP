package Question50;

import java.util.Comparator;

public class MyVector implements Comparable<MyVector> {

    private final int x, y, z;

    MyVector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public int compareTo(MyVector o) {
        return Comparator.comparing(MyVector::getZ).thenComparing(MyVector::getY).thenComparing(MyVector::getX)
                .compare(this, o);
    }

    @Override
    public String toString() {
        String res = "(" + getX() + ", " + getY() + ", " + getZ() + ")";
        return res;
    }

}
