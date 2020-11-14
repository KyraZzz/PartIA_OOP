package supervision1;


public class TailRecursion{
    public static long factorial(int n){
        if (n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }

    public static long factorialRec(int n, int res){
        if (n<=1){
            return res;
        }
        return factorialRec(n-1,res*n);

    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long res = factorial(12);
        long endTime = System.nanoTime();
        System.out.println(res);
        System.out.println(endTime-startTime);
        startTime = System.nanoTime();
        res = factorialRec(12,1);
        endTime = System.nanoTime();
        System.out.println(res);
        System.out.println(endTime-startTime);
    }
}