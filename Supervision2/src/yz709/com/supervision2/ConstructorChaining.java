package yz709.com.supervision2;

class A {
    private int item;

    A(int item) {
        this.item = item;
        System.out.println("A constructor");
    }
}

class B extends A {
    // since A has a customised constructor, we have to explicitly invoke the
    // super(args list) method
    B(int item) {
        super(item);
        System.out.println("B constructor");
    }

}

class C extends B {
    // Because of constructor chaining, B has a customised constructor hence we have
    // to invoke the super(args list) method in C's construtor as well
    C(int item) {
        super(item);
        System.out.println("C constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        C myC = new C(2);
    }
}

/*
 * 
 * output:
 * 
 * A constructor
 * 
 * B constructor
 * 
 * C constructor
 * 
 */
