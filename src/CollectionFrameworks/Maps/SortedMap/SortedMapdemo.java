package CollectionFrameworks.Maps.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapdemo {
    public static void main(String[] args) {
        SortedMap<Integer , String> map = new TreeMap<>((a , b) -> b - a );//using a comparator
        map.put(96, "Ayish");
        map.put(97, "Chowli");
        map.put(76, "Abir");
        map.put(2,"Priya");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(96));//exclude
        System.out.println(map.tailMap(96));

    }
}
