package supervision1.question9;

public class FunctionalArray {
    private int size;
    BinaryTreeNode root;

    FunctionalArray(int num) {
        root = new BinaryTreeNode(0);
        size = num;
    }

    void set(int index, int value) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index out of range of the functional array.");
        }
        BinaryTreeNode current = root;
        index++;
        while (index != 1) {
            if (index % 2 == 0) {
                if (current.mLeft == null) {
                    current.setLeft(new BinaryTreeNode(0));
                }
                current = current.getLeft();
            } else {
                if (current.mRight == null) {
                    current.setRight(new BinaryTreeNode(0));
                }
                current = current.getRight();
            }
            index /= 2;
        }
        current.setValue(value);
    }

    int get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index out of range of the functional array.");
        }
        index++;
        BinaryTreeNode current = root;
        while (index != 1) {
            if (index % 2 == 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            index /= 2;
        }
        return current.getValue();
    }

    public static void main(String[] args) {
        FunctionalArray arr = new FunctionalArray(7);
        arr.set(4, 8);
        arr.set(5, 3);
        arr.set(6, 0);
        arr.set(0, 5);
        arr.set(1, 9);
        arr.set(2, 11);
        arr.set(3, 7);
        arr.set(11, 2);
        for (int i = 0; i < arr.size; i++) {
            System.out.println(arr.get(i));
        }
    }
}
