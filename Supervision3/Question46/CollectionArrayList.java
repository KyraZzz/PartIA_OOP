package Question46;

import java.util.AbstractList;

public class CollectionArrayList<E> extends AbstractList<E> {

    private E[] elements;
    private static final int INITIAL = 5;
    private int size; // the actual places available in the array
    private int tail; // the actual number of elements(excluding Null) in the array

    @SuppressWarnings("unchecked")
    CollectionArrayList(E[] arr) {
        if (arr.length == 0) {
            this.elements = (E[]) new Object[INITIAL];
            this.size = INITIAL;
        } else {
            this.elements = arr;
            this.size = arr.length;
        }
    }

    @Override
    public boolean add(E ele) {
        if (size - 1 == tail) {
            reSize();
        }
        elements[tail++] = ele;
        return true;

    }

    @Override
    public E get(int index) {
        if (index < tail && index >= 0) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    public void reSize() {
        Object[] newArr = new Object[this.size + INITIAL];
        for (int i = 0; i < this.size; i++) {
            newArr[i] = elements[i];
        }
        elements = (E[]) newArr;
        this.size *= 2;

    }

    @Override
    public String toString() {
        String res = "[";
        for (int i = 0; i < this.tail - 1; i++) {
            res += elements[i] + ", ";
        }
        res += elements[tail - 1] + "]";
        return res;
    }

}
