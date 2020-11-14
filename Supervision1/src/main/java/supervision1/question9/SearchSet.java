package supervision1.question9;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet(){
    }

    public void insert(int element){
        BinaryTreeNode newNode = new BinaryTreeNode(1);
        if (mHead==null){
            mHead = new BinaryTreeNode(0);
        }
        BinaryTreeNode current = mHead;
        while (element!=1){
            if (element%2==0){
                if (current.mLeft==null){
                    current.setLeft(new BinaryTreeNode(0));
                }
                current = current.getLeft();
            }
            else {
                if (current.mRight==null){
                    current.setRight(new BinaryTreeNode(0));
                }
                current = current.getRight();
            }
            element /= 2;
        }
        current.setValue(1);
        mElements++;
    }

    public int getNumberElements(){
        return mElements;
    }

    public boolean contains(int element){
        BinaryTreeNode current = mHead;
        while (element!=1){
            if (element%2==0){
                if (current.mLeft==null){
                    current.setLeft(new BinaryTreeNode(0));
                }
                current = current.getLeft();
            }
            else {
                if (current.mRight==null){
                    current.setRight(new BinaryTreeNode(0));
                }
                current = current.getRight();
            }
            element /= 2;
        }
        if(current.getValue()==1){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        SearchSet s = new SearchSet();
        s.insert(3);
        s.insert(4);
        s.insert(11);
        System.out.println(s.contains(1));
        System.out.println(s.getNumberElements());
        System.out.println(s.contains(11));
    }

}
