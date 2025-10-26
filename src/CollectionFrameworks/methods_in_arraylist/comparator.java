package CollectionFrameworks.methods_in_arraylist;

import java.util.ArrayList;

public class comparator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.sort((a, b) -> {
            return -1 * a.compareTo(b);
        });// by using lambda function
        System.out.println(cars);
    }
}