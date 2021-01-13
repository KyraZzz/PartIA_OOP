package Question51;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.addPair("A", 80.5);
        stu.addPair("F", 69.9);
        stu.addPair("B", 79.9);
        stu.addPair("D", 99.9);
        stu.addPair("C", 90.5);
        stu.addPair("E", 70.5);

        System.out.println(stu.alphabetSort()); // [A, B, C, D, E, F]
        System.out.println(stu.topPName(20)); // [D]
        System.out.println(stu.getMedian()); // 80.2
    }
}
