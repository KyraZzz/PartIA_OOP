# Supervision 3 - Kyra
## Q45. Using the Java API documentation or otherwise, compare the Java classes Vector, LinkedList, ArrayList and TreeSet.

1. Inheritance:
   1. `Vector`, `ArrayList` and `LinkedList` implemented the `List` interface.
   2. `LinkedList` also implements the `Queue` interface.
   3. `TreeSet` implemented the `SortedSet` interface which inherited the `Set` interface.
   4. Both the `List` interface and the `Set` interface inherited the `Iterable`, `Collection` interface which means all the subclasses in the collections framwork (i.e., `Vector`, `LinkedList`, `ArrayList` and `TreeSet`) are iterable.
2. Duplicate elements:
   1. `TreeSet` only stores unique elements.
   2. `Vector`, `ArrayList` and `LinkedList` can store duplicated elements.
3. The order of elements:
   1. In `TreeSet` - a natural order because it uses a Red-black tree(i.e., self-balancing binary tree) to sort the elements, we can pass a comparator to implement a custom sorting order.
   2. In `ArrayList`, `Vector` and `LinkedList`, all of them follows an insertion order.
4. Thread-safe:
   1. Only `Vector` is thread-safe because objects in `Vector` class is immutable and can be executed parallely.
   2. `TreeSet`, `LinkedList` and `ArrayList` are all dynamic in nature, so they are not thread-safe. However, we can have a synchronised wrapper to make them thread-safe.
5. Element access:
   1. `ArrayList` uses indexes to access elements, so manipulating `ArrayList` might be slower than `LinkedList` because it requires to shift elements around.
   2. `LinkedList` is a recursive data structure uses two fields, one is value and one is a pointer to the next element, so accessing elements requires to traverse the linkedlist from the head element. It stores elements in a heap data structure.
   3. `Vector` is similar to `ArrayList`, which uses indexes but it is immutable and thread-safe.
   4. `TreeSet` is a self-balancing binary tree so it access elements by traversing through the tree from the root node element.
   
``` java
// Comments:









```

## Q46. Java provides the List interface and an abstract class that implements much of it called AbstractList. The intention is that you can extend AbstractList and just fill in a few implementation details to have a Collections-compatible structure. Write a new class CollectionArrayList that implements a mutable Collections-compatible Generics array-based list using this technique. Comment on any difficulties you encounter.

[Question 46 on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question45)

* Difficulties I have encountered:
  
    1. Resize and reallocate process:
       * The internal array has a fixed size, if users want to add extra elements into the array, but this operation will cause the array to excess its initial capacity, then I have to initialise a new array with more capacities and then reallocate all the elements from the previous array into the new one.
    2. Casting from `Object[]` to `E[]`, I know from the point of type erasure that all unbound paramaterised type will be cast into `Object`. When I cast `E[]` to `Object[]`, IDE reported a warning `Type safety: Unchecked cast from Object[] to E[]`. 
        * Is it because if `E[]` is a bounded paramaterised type (i.e., E extends classA) then only classA and its subtypes are allowed, thus `Object[]` cannot be casted into `E[]`(i.e., `Object[]` is a superclass of classA)? 

``` java
// Comments:









```

## Q47 Write a Java program that calculates the average (mean) for a list of integers. Provide three implmentations: 1) using a regular for-loop; 2) using a for-each loop; 3) using an iterator. What are the pros and cons of each?

[Question 47 on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question47)

1. Using a regular for-loop:
   
    * Pros:
        
        1. Basic and relatively easy to understand. We can access to the index of the element.
        2. We can iterative the collection in any order we want, we can also iterate part of the collection using bounds and steps.


    * Cons:    
  
        1. We can not delete elements in the collection while iterating through it.
        2. We use index to iterate the elements inside a collection, the `for-loop` can not be directly used if the collection is not index based, we have to apply some logic.


2. Using a for-each loop:
   
    * Pros:   
  
        1. It normally has the shortest syntax, improve readability and become more clear.
        2. Level up the abstraction for programmers as they do not need to work on the implementation details of iteration (either using an index or an iterator).
        3. We do not need to use indexes, so some data structures which are not index-based can be iterated through.

    * Cons: 
     
        1. We can not delete elements in the collection while iterating through it.
        2. We can not access to the index of the elements.

  
3. Using an iterator:
   
    * Pros:
        
        1. We can delete elements in the collection while iterating through it.
        2. It is an abstraction, it allows user to process every element of a container while isolating the user from the internal structure of the container.
        3. Do not need to use index to access elements, so data structures which are not index-based can be iterated through.

    * Cons: 

        1. Only collections which implemented the iterable interface will have a built-in iterator, programmers need to write an iterator for their customised data structures.
        2. We can not access to the index of the element.

``` java
// Comments:









```

## Q48. Explain why the following code excerpts behave differently when compiled and run (may need some research):

``` java
// Question 48
String s1 = new String("Hi");
String s2 = new String("Hi");
System.out.println( (s1==s2) );
String s3 = "Hi";
String s4 = "Hi";
System.out.println( (s3==s4) );

// results are as follows:
// false
// true
```

1. `s1` and `s2` are references which points to a chunk of memory that store the actural data. Hence, `s1==s2` is a reference equality test, it tests whether the memory addresses of the data each reference points to are the same. Since we have constructed the two strings independently using `new`, the twp strings are two different instances of the `String` class, thus they are stored in different memory locations.
2. Strings are immutable and we have a `String Constant Pool` in Java which is a separate place in heap memory where the values of all the strings which are defined in the program are stored. It aims at reducing memory usage and encourage reuse of the existing instances in memory. So a String declared using `""(double quotes)` which has the same value as one of the existing one will points to the same memory address that stores the data.
3. Hence `s3` and `s4` points to the same immutable string value on the heap memory, they have the same memory address. A reference equality test shows they are indeed the same (i.e, true).

``` java
// Comments:









```

## Q49. Complete part 6 of the ‘Classic collections’ task on Chime

1. Change the generic parameter of `LinkList` class to add the constraint that the object in the list must be Comparable.
   
   ```java
    public class LinkList<T> implements OopList, Comparable<T>{
        ...
    }
   ```

2. Why is it safe not to include this constraint in `OopList`
    * Because if we have included this constraint in `OopList`, then all the classes which implements the `OopList` interface needs to give implementation details for the `compareTo(Object obj)` method.
    * Some classes do not need to compare two instances and sometimes it does not make sense to compare two instance for a class.

3. 

``` java
// Comments:
// Todo








```

## Q50.  Write an immutable class that represents a 3D point (x,y,z). Give it a natural order such that values are sorted in ascending order by z, then y, then x

[Question 50 on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question50)

``` java
// Comments:








```

## Q51. Write a Java class that can store a series of student names and their corresponding marks (percentages) for the year. Your class should use at least one Map and should be able to output a List of all students (sorted alphabetically); a List containing the names of the top P% of the year as well; and the median mark.

[Question 51 on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question51)

* I implemented the Student class with Comparator interface and implemented the method to compare two doubles.
* I also construct a shared comparator to sort the array in a decending order according to the percentage.

``` java
Comparator<String> SortByPercentUp = (s1, s2) -> compare(map.get(s1), map.get(s2));

...
@Override
public int compare(Double double1, Double double2) {
    return double2.compareTo(double1);
}

```

``` java
// Comments:








```

## Q52. The user of the class Car below wishes to maintain a collection of Car objects such that they can be iterated over in some specific order.

[Question 52 on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question52)

``` java
public class Car {
private String manufacturer;
private int age;
}

```
* (a) Show how to keep the collection sorted alphabetically by the manufacturer without writing a Comparator.
  * If we are not allowed to write a comparator, we can implement the comparable interface for the collection framework. This requires us to implement the `compareTo` function. Since the variable `manufacturer` is a string type, we can invoke the `compareTo` method on `String` class to compare the two string values
  ``` java
    @Override
    public int compareTo(Car o) {
        return this.manufacturer.compareTo(o.manufacturer);
    }

    Car[] arr = { car1, car2, car3, car4 };
    ArrayList<Car> carList = new ArrayList<>(Arrays.asList(arr));

    // Main.java
    import java.util.Collections;
    // Test 1:
    Collections.sort(carList);
    System.out.println(carList); 
    // [(a, 3), (b, 1), (e, 7), (e, 0)]

  ```
* (b) Using a Comparator, show how to keep the collection sorted by {manufacturer, age}. i.e. sort first by manufacturer, and sub-sort by age.

    * The `sort` method requires an customised comparator. We chaining comparators to compare multiple fields, first by manufacturer, then by age.
    ``` java
    // Main.java
    import java.util.Comparator;
    ...
    // Test 2:
    carList.sort(Comparator.comparing(Car::getManufacturer).thenComparing(Car::getAge));
    System.out.println(carList); 
    // [(a, 3), (b, 1), (e, 0), (e, 7)]
    ```
``` java
// Comments:








```

## Q53.  Write a Java program that reads in a text file that contains two integers on each line, separated by a comma (i.e. two columns in a comma-separated file). Your program should print out the same set of numbers, but sorted by the first column and subsorted by the second.
[Code on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question53)

``` java
// Comments:








```

## Q54. The following code captures errors using return values. Rewrite it to use exceptions.

``` java
public class RetValTest {
public static String sEmail = "";
public static int extractCamEmail(String sentence) {
if (sentence==null || sentence.length()==0)
return -1; // Error - sentence empty
String tokens[] = sentence.split(" "); // split into tokens
for (int i=0; i< tokens.length; i++) {
if (tokens[i].endsWith("@cam.ac.uk")) {
sEmail=tokens[i];
return 0; // success
}
}
return -2; // Error - no cam email found
}
public static void main(String[] args) {
int ret=RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
if (ret==0) System.out.println("Success: "+RetValTest.sEmail);
else if (ret==-1) System.out.println("Supplied string empty");
else System.out.println("No @cam address in supplied string");
}


```

[Question 54 on Github](https://github.com/KyraZzz/PartIA_OOP/tree/master/Supervision3/Question54)

Since the code is also relatively short, I also included it here for reference.

``` java 
package Question54;

import java.util.NoSuchElementException;

public class RetValTest {
    public static String extractCamEmail(String sentence) {
        String sEmail = "";
        try {
            if (sentence == null || sentence.length() == 0)
                throw new Exception("Supplied string empty"); // Error - sentence empty
            String tokens[] = sentence.split(" "); // split into tokens
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].endsWith("@cam.ac.uk")) {
                    sEmail = tokens[i];// success
                }
            }
            if (sEmail == "") {
                throw new NoSuchElementException("Error - no cam email found"); // Error - no cam email found
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sEmail;
    }

    public static void main(String[] args) {
        String res = RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
        System.out.println(res); // "rkh23@cam.ac.uk"
        res = RetValTest.extractCamEmail(""); // throw "java.lang.Exception: Supplied string empty"
        System.out.println(res); // ""
        res = RetValTest.extractCamEmail("aaa"); // java.util.NoSuchElementException: Error - no cam email found
        System.out.println(res); // ""
    }
}

```

``` java
// Comments:








```

## Q55. Write a Java function that computes the square root of a double number using the Newton-Raphson method. Your function should make appropriate use of exceptions

[Question 55 on Github]()

``` java
// Comments:








```