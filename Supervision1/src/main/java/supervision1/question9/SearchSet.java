package supervision1.question9;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
    }

    public void insert(int element) {
        BinaryTreeNode newNode = new BinaryTreeNode(element);
        if (mHead == null) {
            mHead = newNode;
            mElements++;
            return;
        }
        BinaryTreeNode current = mHead;
        while (true) {
            if (element < mHead.getValue()) {
                if (current.mLeft == null) {
                    current.setLeft(newNode);
                    mElements++;
                    break;
                }
                current = current.getLeft();
            } else if (element > mHead.getValue()) {
                if (current.mRight == null) {
                    current.setRight(newNode);
                    mElements++;
                    break;
                }
                current = current.getRight();
            } else {
                break;
            }
        }
    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int element) {
        BinaryTreeNode current = mHead;
        while (true) {
            if (element < current.getValue()) {
                if (current.mLeft == null) {
                    return false;
                }
                current = current.getLeft();
            } else if (element > current.getValue()) {
                if (current.mRight == null) {
                    return false;
                }
                current = current.getRight();
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        SearchSet s = new SearchSet();
        s.insert(3);
        s.insert(4);
        s.insert(11);
        System.out.println(s.contains(1));
        System.out.println(s.getNumberElements());
        System.out.println(s.contains(11));
    }

}
