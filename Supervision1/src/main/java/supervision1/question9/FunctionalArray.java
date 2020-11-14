package supervision1.question9;

public class FunctionalArray {
    private int size;
    BinaryTreeNode root;
    FunctionalArray(int num){
        root = new BinaryTreeNode(0);
        size = num;
    }
    void set(int index,int value) {
        if (index>=size){
            throw new IndexOutOfBoundsException("Index out of range of the functional array.");
        }
        BinaryTreeNode current = root;
        while (index>0){

        }
    }
    int get(int index){
        return 0;
    }
}
