package yz709.com.supervision2;

public class Main {

    public static int x() {
        try {
            return 6;
        } finally {
            System.out.println("finally block");
        }
    }

    public static void main(String[] args) {
        System.out.println(x());

    }
}
