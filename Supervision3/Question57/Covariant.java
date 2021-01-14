package Question57;

public class Covariant {
    public static void main(String[] args) {
        Integer[] arrI = { 1, 2, 4, 9 };
        Number[] arrN = arrI;
        arrN[0] = 2.5f; // cause runtime error
    }
}
