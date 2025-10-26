package CollectionFrameworks.methods_in_arraylist;

import java.util.ArrayList;
public class size {
        //The size() method indicates how many elements are in the list.
        public static void main(String[] args) {

            ArrayList<Integer> arraylist =new ArrayList<>();
            arraylist.add(1);
            arraylist.add(24);
            arraylist.add(38);
            System.out.println(arraylist.size());//we are printing the size of the array.

            ArrayList<String> cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("Volkswagen");
            cars.add("Mercedes");
            System.out.println(cars.size());//we are printing the size of the array.


        }

    }