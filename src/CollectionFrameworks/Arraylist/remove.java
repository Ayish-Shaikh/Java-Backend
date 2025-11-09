package CollectionFrameworks.Arraylist;

import java.util.ArrayList;

public class remove {
    //The remove() method removes an item from the list, either by position or by value. If a position is specified then this method returns the removed item. If a value is specified then it returns true if the value was found and false otherwise.
    //If a value is specified and multiple elements in the list have the same value then only the first one is deleted.
    //If the list contains integers and you want to delete an integer based on its value you will need to pass an Integer object.
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(24);
        arraylist.add(38);
        System.out.println(arraylist.remove(2));//remove the element from index 2
        System.out.println(arraylist);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.remove(3));
        System.out.println(cars);
    }
}
