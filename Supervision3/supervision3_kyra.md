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

[Question 50 on Github]()