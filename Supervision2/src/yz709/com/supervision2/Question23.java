package yz709.com.supervision2;

public class Question23 {
    public static void add(int[] xy,int dx, int dy) {
        xy[0]+=dx;
        xy[1]+=dy;
    }
    public static void add(int x,int y,int dx, int dy) {
        x=x+dx;
        y=y+dy;
    }
    public static void main(String[] args) {
        int xypair[] = {1,1};
        add(xypair[0], xypair[1], 1, 1);
        System.out.println(xypair[0]+" "+xypair[1]);
        add(xypair,1,1);
        System.out.println(xypair[0]+" "+xypair[1]);
    }
}
