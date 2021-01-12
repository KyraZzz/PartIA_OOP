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

``` java
// Comments:









```