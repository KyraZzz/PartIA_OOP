package Question45;

public class Main {
    public static void main(String[] args) {
        Integer[] myArr = {};
        CollectionArrayList<Integer> arr = new CollectionArrayList<Integer>(myArr);
        arr.add(3);
        arr.add(5);
        // System.out.println(arr.get(11)); // index out of bound exception
        arr.add(7);
        arr.add(5);
        arr.add(9);
        arr.add(11);
        System.out.println(arr.get(5));
        System.out.println(arr);

        String[] myArr2 = { "a", "b" };
        CollectionArrayList<String> arr2 = new CollectionArrayList<String>(myArr2);
        arr2.add("c");
        arr2.add("d");
        arr2.add("e");
        arr2.add("f");
        System.out.println(arr2);
        // System.out.println(arr2.get(5)); // IndexOutOfBoundsException
        System.out.println(arr2.get(2));
    }
}
