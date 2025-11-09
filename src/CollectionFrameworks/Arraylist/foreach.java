package CollectionFrameworks.Arraylist;

import java.util.ArrayList;
public class foreach {
    //The forEach() method performs an action on every item in a list.
    // The action can be defined by a lambda expression that is compatible with the accept() method of Java's Consumer interface.
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(24);
        arraylist.add(38);
        //can write for each loop both ways
        arraylist.forEach( (n) -> { System.out.println(n); } );// simply x is element here not a pointer so it will print the output accordingly.
//        for(int n: arraylist){
//            System.out.println(n);
//        }

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Volkswagen");
        cars.add("Mercedes");
        for(String x: cars){
            System.out.println(x);
        }
    }
}