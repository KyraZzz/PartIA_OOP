package Question47;

import java.util.ArrayList;
import java.util.Iterator;

public class CalcMean {

    public static double calcFor(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        double res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res += arr.get(i);
        }
        return res / arr.size();
    }

    public static double calcForEach(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        double res = 0;
        for (int ele : arr) {
            res += ele;
        }
        return res / arr.size();
    }

    public static double calcIterator(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        double res = 0;
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            res += it.next();
        }
        return res / arr.size();
    }
}
