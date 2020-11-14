package supervision1;

public class Test {
    int x=-1;
    public void Test() {
        this.x=7;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }
}
