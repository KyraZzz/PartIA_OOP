## 23. (W) Explain the result of the following code.
``` java
public static void add(int[] xy,int dx, int dy) {
xy[0]+=dx;
xy[1]+=dy;
}
public static void add(int x,int y,int dx, int dy) {
x=x+dx;
y=y+dy;
}
public static void main(String[] args) {
int xypair[] = {1,1};
add(xypair[0], xypair[1], 1, 1);
System.out.println(xypair[0]+" "+xypair[1]);
add(xypair,1,1);
System.out.println(xypair[0]+" "+xypair[1]);
}
```
* When calling the Java functions, the arguments are passed by value: the primitive types are passed by their actual value while the reference types are passed by their value of the reference, not the actual data stored on the heap.
* `xypair` is a reference type while `xypair[0]` is the data stored one the heap pointed by the reference at index 0, so it is an actual value.
* The first command `add(xypair[0], xypair[1], 1, 1)`: all the arguments are primitive types, so 
