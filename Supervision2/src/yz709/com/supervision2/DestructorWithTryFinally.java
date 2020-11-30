package yz709.com.supervision2;

import java.io.Closeable;
import java.io.IOException;

class myClass implements Closeable {
    private int item;

    myClass(int item) {
        this.item = item;
    };

    public void call() {
        System.out.println(item);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");

    }
}

public class DestructorWithTryFinally {
    public static void main(String[] args) throws IOException {
        myClass a = new myClass(1);
        try {
            a.call();
        } finally {
            a.close();
        }
    }
}