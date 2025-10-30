package CollectionFrameworks.Maps.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
        //map2.put("C", 3); throws exception
        Map<String, Integer> map3 = Map.of("Ayish", 98, "Abir", 99);//maps.of method is limited to 10 key value pairs
//        map3.put("Chowli", 98);throws exception
        System.out.println(map3);

        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Rayan", 9), Map.entry("Priy", 2));//here the user can give multiple entries
        System.out.println(map4);
    }
}
