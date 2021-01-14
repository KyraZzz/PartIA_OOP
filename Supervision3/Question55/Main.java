package Question55;

public class Main {
    public static void main(String[] args) {
        double res = SquareRoot.computeSquareRoot(0);
        System.out.println(res); // 0.0
        res = SquareRoot.computeSquareRoot(5);
        System.out.println(res); // 2.23606797749979
        res = SquareRoot.computeSquareRoot(2);
        System.out.println(res); // 1.4142135623730951
        res = SquareRoot.computeSquareRoot(-1);
        System.out.println(res); // Exception in thread "main" java.lang.IllegalArgumentException: Only
                                 // non-negative number has a square root.
    }
}
