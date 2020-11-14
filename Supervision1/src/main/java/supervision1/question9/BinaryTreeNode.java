package supervision1.question9;

public class BinaryTreeNode {
    private int mValue;
    BinaryTreeNode mLeft;
    BinaryTreeNode mRight;

    BinaryTreeNode(int value){
        mValue = value;
        mLeft = null;
        mRight = null;
    }
    int getValue(){
        return mValue;
    }
    void setValue(int value){
        mValue = value;
    }
    BinaryTreeNode getLeft(){
        return mLeft;
    }
    BinaryTreeNode getRight(){
        return mRight;
    }
    void setLeft(BinaryTreeNode lc){
        mLeft = lc;
    }
    void setRight(BinaryTreeNode rc){
        mRight = rc;
    }
}
