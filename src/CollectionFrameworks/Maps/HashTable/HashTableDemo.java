package CollectionFrameworks.Maps.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer , String> hashtable = new Hashtable<>();
        //Hashtable is synchronizwed
        //no null or key value
        //Legacy Class, ConcurrentHashMap
        //slower than HashMap
        //only linked list in case of collision
        hashtable.put(1, "Khardah");
        hashtable.put(2, "Barrackpore");
        hashtable.put(3, "Cebu");
        System.out.println(hashtable);
        System.out.println("value for key 2: " + hashtable.get(2));
        System.out.println("Does key 3 exist ? " + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("After removing 1 " + hashtable);

    }
}
