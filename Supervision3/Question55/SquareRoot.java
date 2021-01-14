package Question55;

public class SquareRoot {

    public static double computeSquareRoot(double k) {

        if (k < 0) {
            throw new IllegalArgumentException("Only non-negative number has a square root.");
        }
        if (k == 0) {
            return 0;
        }
        // f(x) = x^2 - k
        // using a pre-determined error to avoid trapping into an infinite loop
        double error = 1e-10f;
        double x0 = 1f;
        double fx = 0f;
        double dx = 0f;
        do {
            dx = 2 * x0;
            fx = Math.pow(x0, 2) - k;
            x0 = x0 - fx / dx;
        } while (Math.abs(fx / dx) > error);
        return x0;
    }
}