package CollectionFrameworks.Arraylist;

import java.util.ArrayList;
public class add {
        //add()-The add() method adds an item to the list
        //If an index is provided then the new item will be placed at the specified index, pushing all of the following elements in the list ahead by one
        //If an index is not provided then the new item will be placed at the end of the list.
        public static void main(String[] args) {

            ArrayList<Integer> arraylist =new ArrayList<>();//imp - you can omit writing Arraylist<Integer> after new Arraylist<> as after java 7 you can freely give the return type in the first one and omit writing the second one but for understanding better and writing it will have a good practise
            arraylist.add(1);
            arraylist.add(24);
            arraylist.add(38);
            System.out.println(arraylist);

            ArrayList<String> cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("Volkswagen");
            cars.add("Mercedes");
            System.out.println(cars);
        }

    }
