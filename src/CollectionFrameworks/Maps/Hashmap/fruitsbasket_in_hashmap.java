package CollectionFrameworks.Maps.Hashmap;

import java.util.HashMap;
public class fruitsbasket_in_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> fruitbasket = new HashMap<>();
        fruitbasket.put("Apple",50);
        fruitbasket.put("Banana",30);
        fruitbasket.put("Orange",80);
        fruitbasket.put("Grape",20);
        System.out.println(fruitbasket);
    }
}
