package Question50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyVector vec1 = new MyVector(2, 3, 7);
        MyVector vec2 = new MyVector(9, 5, 2);
        System.out.println(vec1.compareTo(vec2));

        MyVector[] arr = { vec1, vec2 };
        ArrayList<MyVector> vecList = new ArrayList<MyVector>(Arrays.asList(arr));
        Collections.sort(vecList);
        System.out.println(vecList);
    }
}
