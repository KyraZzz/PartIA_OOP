package Question52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("a", 3);
        Car car2 = new Car("e", 7);
        Car car3 = new Car("e", 0);
        Car car4 = new Car("b", 1);

        Car[] arr = { car1, car2, car3, car4 };
        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(arr));
        // Test 1:
        Collections.sort(carList);
        System.out.println(carList); // [(a, 3), (b, 1), (e, 7), (e, 0)]

        // Test 2:
        carList.sort(Comparator.comparing(Car::getManufacturer).thenComparing(Car::getAge));
        System.out.println(carList); // [(a, 3), (b, 1), (e, 0), (e, 7)]

    }
}
