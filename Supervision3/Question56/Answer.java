package Question56;

public class Answer {
    public static int pow(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The exponent should be a positive integer.");
        }
        int res = 1;
        while (n != 0) {
            res *= x;
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = Answer.pow(2, 3);
        System.out.println(res); // 8
        res = Answer.pow(2, 1);
        System.out.println(res); // 1
        res = Answer.pow(2, -1);
        System.out.println(res); // Exception in thread "main" java.lang.IllegalArgumentException: The exponent
                                 // should be a positive integer.
                                 // at Answer.pow(Answer.java:4)
                                 // at Answer.main(Answer.java:17)
    }
}
