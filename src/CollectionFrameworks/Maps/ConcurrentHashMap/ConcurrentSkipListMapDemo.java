package CollectionFrameworks.Maps.ConcurrentHashMap;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        //MAP --> SORTED --> THREAD SAFE --> ConcurrrentSkipListMap;
        //example - 'HI' 'ITS' 'CONCURRENTSKIPLISTMAP' 'USED' 'TO SORT'
        ConcurrentSkipListMap<Integer,String> map = new ConcurrentSkipListMap<>();
        map.put(3,"ConcurrentSkipListMap");
        map.put(2,"it's");
        map.put(1,"hi");
        map.put(5,"to sort");
        map.put(4,"used");


        System.out.println("Initial Map: " + map);
        System.out.println("ceilingEntry-2: " + map.ceilingEntry(2));
        NavigableSet<Integer> navigableSet = map.descendingKeySet();
        for (int s: navigableSet){
            System.out.println(s);
        }
        System.out.println("firstEntry: " + map.firstEntry());
        System.out.println("lastEntry: " + map.lastEntry());
        System.out.println("pollFirstEntry: " + map.pollFirstEntry());
        System.out.println("now firstEntry: " + map.firstEntry());
        System.out.println("pollLastEntry: " + map.pollLastEntry());
        System.out.println("now lastEntry: " + map.lastEntry());
    }
}
