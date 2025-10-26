package CollectionFrameworks.methods_in_arraylist;

import java.util.ArrayList;
public class get {
        //The get() method returns the item at a specified position in the list.
        public static void main(String[] args) {

            ArrayList<Integer> arraylist =new ArrayList<>();
            arraylist.add(1);
            arraylist.add(24);
            arraylist.add(38);
            System.out.println(arraylist.get(2));//we are specifically telling to give me the index 2 element which is 38.

            ArrayList<String> cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("Volkswagen");
            cars.add("Mercedes");
            System.out.println(cars.get(2));//we are specifically telling to give me the index 2 element which is Mercedes.


        }

    }