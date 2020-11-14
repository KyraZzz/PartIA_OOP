## Q1. (W) Set up SSH, git, and IDE and your account on Chime
## Q2. (W) Complete the Fibonacci task on Chime
[Fibonacci Task on Chime](https://chime.cl.cam.ac.uk/page/repos/yz709/fibonacci/code})
#### (a) Why would one argue that the provided tests for Fibonacci are not sufficient?
* If the tests have not go through all the branches in the codes, then it is not sufficient 
to say the code is robust because without testing all the branches, one of them might have
unexpected bugs remaining.

#### (b) Why would it be a bad idea to write a test that times whether FibonacciTable runs faster than Fibonacci?
* The run time will differentiate if the number of test cases are relatively big, otherwise
the difference between run time is too tiny that we are not able to distinguish. Since it takes 
a lot of time to write a sufficient amount of tests, it will be a bad idea in practice.
* Even with the sufficient amount of test data, we have to iteratively do the same test on both
programs to enable us to conclude because there might be some environmental factors involved in
each test which might influence an individual test round. By multiple test rounds, we can finally
give the correct conclusion.

## Q3. What does instruction coverage mean as a test coverage metric? Give an example showing how 100% instruction coverage does not mean your program is bug free.
* Instruction coverage: The amount of instructions or branches of the program that have been gone through during testing.
For a valid input, the program will execute properly if the percentage coverage is high.
* It might still have bugs if we have not set up a path to deal with invalid inputs. For instance,
in the fibonacci program, if we receive a number that is smaller than 1, and we have no path to deal with it, we will receive an error
such as null pointer exception.

## Q4. (W) Compare and contrast a typical functional language and a typical imperative language.
* For instance, we pick `OCaml`
```java
// TODO
```

## Q5. Write Java code to test whether your Java environment performs tail-recursion optimisations or not.
```java
// TODO
```

## Q6. Write a static function lowestCommon that takes two long arguments and returns the position of the first set bit in common, where position 0 is the LSB. If there is no common bit, the function should return -1. For example lowestCommon(14,25) would be 3. Your solution should use at least one break statement.
[Question 6 code on Github](https://github.com/KyraZzz/PartIA_OOP/blob/master/Supervision1/src/main/java/supervision1/LowestCommon.java)

## Q7. Identify the primitives, references, classes and objects in the following Java code:
``` java
double d = 5.0;
int i[] = {1,2,3,4};
LinkedList<Double> l = new LinkedList<Double>();
Double k = new Double();
Tree t;
float f;
Computer c = null;
```
* Primitives: `d`, `f` 
* References: `i`, `l`, `k`, `t`, `c`
* Classes: `LinkedList<Double>`, `Double`, `Tree` ,`Computer`
* Objects: `new LinkedList<Double>()`, `new Double()`
> A reference is an entity which provides a way to access object of its type. An object is an entity which provides a way to access the members of it's class or type

## Q8. You met the idea of linked lists in FoCS. Complete the first part of the ‘Classic collections’ task on Chime.
[Classic Collections Part 1](https://chime.cl.cam.ac.uk/page/repos/yz709/classic_collections_lists_and_queues/code/07176eecc39ccc93ca73ac7b300d987e5a134e68)
* (a) How is an empty list represented?
    * When we set both the head and the tail of the list as null.
* (b) How does the toString method implement the list traversal?
    * Both the LinkList Class and the Node Class overrides the default `toString()` method.
    * We first call the `toString()` method from the LinkedList Class because we have only access to a LinkedList object in the Main class.
    * The `toString()` method from the LinkedList Class checks whether the list is empty or not based on its value of the head element.
    * If the head element is not null, then we use the head element to access the `toString()` method from the Node Class.
    * If the next element is null, then we return a string representation of the current value.
    * If the next element is not null, then we add the current value as a part of the return value and recursively use next to call the `toString()` method.
    * Eventually, the value of the Nodes will be passed as a string back to the `toString()` method from the LinkedList Class and formatted for output.
* (c) Given that you are making use of the addFirst method why would it be considered better style to use a static factory method to construct a list rather than doing all the work in the constructor?
    * We need to overload the constructor to allow us to add a first element when there exists a head element.
    * If we already know the elements we want to add into the linked list, we have to manually add them one by one using the constructor; while the `create` static factory method frees our hands and let the for loop to do the tedious job for us.
* (d) Give the UML class diagram for your code.
```java
// TODO
```

### Q9. In mathematics, a set of integers refers to a collection of integers that contains no duplicates. You typically want to insert numbers into a set and query whether the set contains numbers. One approach is to store the numbers in a binary search tree.
(a) The diagram below represents this approach. Implement it in Java, using the names of entities to
decide what they should do. Provide appropriate tests using JUnit.

(b) (b) The BinaryTreeNode class can be reused for other solutions. Create a class FunctionalArray that
    uses BinaryTreeNode to create a functional array of ints. Your class should have a constructor that creates a tree of a given size (passed as an argument); a void set(int index, int value) method; and a int get(int index) method. 
    You should make the functional array zero-indexed to match java’s normal arrays (i.e. the first element has index 0). Requests for indices outside the limits should result in an exception.

```java
// TODO
```

### Q10. Explain why this code prints 0 rather than 7.
``` java
public class Test {
    public int x=0;
    public void Test() {
        x=7;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }
}
```
* There is no customised constructor in the class, because the function `Test()` has a `void` return type, it is thus a public method.
* When we instantiate an object using the default constructor, the value of the variable x is set to 0.
* Hence, when we print it out, it gives a value of 0 as a result.

### Q11. What are the benefits of using private state in conjunction with public getter and setter methods? Are there any disadvantages?
* Advantage:
    * Avoid illegal states of the objects because we can apply pre-evaluation in the setter method to force the user give valid arguments.
    * Some of the fields are implementation details and are not necessary to be seen, so setting them to private prevents them to be accessed outside the class.
* Disadvantage:
    * We have to apply setter and getter methods if we want to modify or change the value of the field. This requires extra logic and codes.

### Q12. Python does not offer a private access modifier and everything is public. Instead, programmers should follow the convention that a variable name should be prefixed with an underscore (‘_’) to signal it should not be accessed or edited externally. Discuss the advantages and disadvantages of this approach compared to Java.
* Advantage:
    * Avoid the confusion between access modifiers, programmers do not need to write extra setter and getter method to access and change the variable values.
* Disadvantage:
    * Convention is not equivalent to syntax, so programmers who are not familiar with this convention might accidently access and modify the variable values from outside of the class, this might lead to bugs.

### Q13. Complete the Matrices programming task on Chime
* (a) Why is it neccessary for the assertions to have the form assertThat(actual).isWithin(tolerance).of(expected);?
    * Because we are dealing with `double` which has a precision limit and when we manipulate the two matrices, for instance, one of the element in the matrix is 7.00000000000001 and the corresponding element in the other matrix is 1.0, when added together, this gives us 8.0 while the correct answer is 8.0000000000001.
* (b) Why have the static factory methods been put in the Shapes class rather than Matrix?
    
```java
// TODO
```

### Q14. This question considers representing a 2D vector in Java.
* (a) Develop a mutable class Vector2D to embody the notion of a 2D vector based on floats (do not
use Generics). At a minimum your class should support addition of two vectors; scalar product;
normalisation and magnitude.
[Code for Part(a) and Part(c) on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision1/src/main/java/supervision1/question14)
* (b) What changes would be needed to make it immutable?
    * Set the fields of the matrix as final so that their values can only be assigned only once.
    * Make all the fields as private so that we do not allow direct access.
    * No setter methods provided for the fields.
    * Initializing all the fields using a constructor performing deep copy.
    * Performing cloning of objects in the getter methods to return a copy rather than returning the actual object reference
* (c) Contrast the following prototypes for the addition method for both the (i) mutable, and (ii) immutable
versions.
    * public void add(Vector2D v)
    * public Vector2D add(Vector2D v)
    * public Vector2D add(Vector2D v1, Vector2D v2)
    * public static Vector2D add(Vector2D v1, Vector2D v2)
(d) How can you convey to a user of your class that it is immutable?
    * Using unit testing to ensure that when constructing the vector, we have taken a deep copy of the value, and after initialization, the value of the vector is unable to be reassigned.

### Q15. Explain in detail why Java’s Generics do not support the use of primitive types as the parameterised type? Why can you not instantiate objects of the template type in generics (i.e. why is new T() forbidden?)
* 
    * Java's Generics only support reference types and not primitive types, because at compile time, primitive types has their own bytecode instructions for loading and storing onto the virtual machine stack.
    * Although it is not impossible to implement, it will make the compiler complicated.

* 
    * Type erasure is applied at compile time and if we instantiate the objects as generics then its type will be erased at compile time. 


