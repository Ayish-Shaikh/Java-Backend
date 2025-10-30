package CollectionFrameworks.Maps.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapdemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        //Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        //only the segement being written to or read from is locke
        //read: do not require locking unless there is a write operation happening on the same segment
        //write:lock

        //java 8--> no segmentation
        //      --> Compare-And-Swap approach --> no locking except resizing or collision
        //Thread A last saw--> x = 42
        //Thread A work --> x to 50
        //if x is still 42 then change it to 50 else dont change and retry
        //put --> index


        // Adding key-value pairs to the map

        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 10);

// Retrieving a value based on a key

        int appleCount = map.get("Apple");
        System.out.println("Count of Apples: " + appleCount);

// Updating the value associated with a key

        map.put("Banana", 8);
        System.out.println("Updated count of Bananas: " + map.get("Banana"));

// Using putIfAbsent to add a key-value pair only if it is not already present

        map.putIfAbsent("Grapes", 12);
        System.out.println("Count of Grapes: " + map.get("Grapes"));

// Removing a key-value pair

        map.remove("Orange");
        System.out.println("Is Orange present? " + map.containsKey("Orange"));

    }

}