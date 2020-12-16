class SuperObject {

    private static final String CONSTANT = print("CONSTANT");

    static {
        print("STATIC INITIALIZER");
    }

    private final String instance = print("instance");

    SuperObject(String arg) {
        print("CONSTRUCTOR");
    }

    private static final String CONSTANT2 = print("CONSTANT2");

    private final String instance2 = print("instance2");

    static String print(String message) {
        System.out.println("SuperObject." + message);
        return null;
    }
}

class ConstructedObject extends SuperObject {

    private static final String CONSTANT = print("CONSTANT");

    static {
        print("STATIC INITIALIZER");
    }

    private final String instance = print("instance");

    ConstructedObject() {
        // tricky bit
        super(print("hello")); // after allocate static fields and statck initilizer blocks in the superclass,
                               // we allocate memory for the object
        print("CONSTRUCTOR");
    }

    private static final String CONSTANT2 = print("CONSTANT2");

    private final String instance2 = print("instance2");

    static String print(String message) {
        System.out.println("ConstructedObject." + message);
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ConstructedObject constructedObject = new ConstructedObject();
    }
}
