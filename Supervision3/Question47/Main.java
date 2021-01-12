package Question47;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 7, 2, 8, 6));
        System.out.println(CalcMean.calcFor(arr));
        System.out.println(CalcMean.calcForEach(arr));
        System.out.println(CalcMean.calcIterator(arr));
    }
}
