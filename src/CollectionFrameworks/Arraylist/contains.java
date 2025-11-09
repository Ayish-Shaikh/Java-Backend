package CollectionFrameworks.Arraylist;

import java.util.ArrayList;

public class contains {
    //The contains() method returns true if an item exists in a list and false otherwise.
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(24);
        arraylist.add(38);
        System.out.println(arraylist.contains(24));//the output will be true cuz it belongs to arraylist
        System.out.println(arraylist.contains(25));//the output will be false cuz it does not belong to arraylist

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Toyota"));
    }
}
