package CollectionFrameworks.Arraylist;

import java.util.ArrayList;

public class sort {
    //The sort() method sorts items in the list. A Comparator can be used to compare pairs of elements. The comparator can be defined by a lambda expression which is compatible with the compare() method of Java's Comparator interface
    //If null is passed into the method then items will be sorted naturally based on their data type (e.g. alphabetically for strings, numerically for numbers). Non-primitive types must implement Java's Comparable interface in order to be sorted without a comparator.
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(24);
        arraylist.add(38);
        arraylist.add(2,30);
        arraylist.sort(null);
        System.out.println(arraylist);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(2,"Mazda");
        cars.sort(null);
        System.out.println(cars);

    }
}
