package supervision1.question9;

public class BinaryTreeNode {
    private int mValue;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    BinaryTreeNode(int value){
        mValue = value;
        leftChild = null;
        rightChild = null;
    }
    int getValue(){
        return mValue;
    }
    void setValue(int value){
        mValue = value;
    }
    BinaryTreeNode getLeft(){
        return leftChild;
    }
    BinaryTreeNode getRight(){
        return rightChild;
    }
    void setLeft(BinaryTreeNode lc){
        leftChild = lc;
    }
    void setRight(BinaryTreeNode rc){
        rightChild = rc;
    }
}
