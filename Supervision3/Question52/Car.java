package Question52;

public class Car implements Comparable<Car> {
    private String manufacturer;
    private int age;

    Car(String manufacturer, int age) {
        this.manufacturer = manufacturer;
        this.age = age;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Car o) {
        return this.manufacturer.compareTo(o.manufacturer);
    }

    @Override
    public String toString() {
        String res = "(" + this.manufacturer + ", " + this.age + ")";
        return res;
    }

}
