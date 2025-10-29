package CollectionFrameworks.Maps.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>(11 , 0.8f , true);//(initialCapacity , loadFactor , accessOrder)
        map.put("Orange", 20);
        map.put("Apple", 30);
        map.put("Guava", 23);

        map.get("Apple");
        map.get("Orange");

        for (Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap Map1 = new LinkedHashMap(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 80);
        hashMap.put("Akshit", 78);

        Integer res = hashMap.getOrDefault("Ayish", 0);
        System.out.println(res);
        hashMap.putIfAbsent("Shubham", 92);//the method checks if the value is present or not if not then it updates the value
        System.out.println(hashMap);

    }
}
