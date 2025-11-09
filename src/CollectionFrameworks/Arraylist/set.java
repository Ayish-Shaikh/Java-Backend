package CollectionFrameworks.Arraylist;

import java.util.ArrayList;

public class set {
    //The set() method replaces an item at a specified position in the list and returns the item that was previously at that position.
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(24);
        arraylist.add(38);
        arraylist.add(2,30);// this method adds the element in the 2nd index and push the 2nd index to the next index
        System.out.println(arraylist);
        arraylist.set(3,31);//this method replaces with the current 2nd index and updates the 2nd index with the current position.
        System.out.println(arraylist);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(2,"Mazda");
        System.out.println(cars);
        cars.set(3,"Volswagen");
        System.out.println(cars);
    }
}
