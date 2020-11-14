package supervision1.question9;

public class SearchSet {
    private int mElements;
    BinaryTreeNode root = new BinaryTreeNode(mElements);
    SearchSet(){
    }

    void insert(int element){
        BinaryTreeNode newNode = new BinaryTreeNode(element);
        BinaryTreeNode current = root;
        while (true){
            if (current.getValue()<newNode.getValue()){

            }
        }

    }

    int getNumberElements(){
        return 0;
    }

    boolean contains(int element){
        return false;
    }

   /*
    void main(String[] args){

    }
    */
}
