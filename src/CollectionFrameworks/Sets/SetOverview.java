package CollectionFrameworks.Sets;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        //Set is a collection tha cannot contain duplicates elements
        //faster operations
        //Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        //Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(11);
        set.add(1);
        set.add(67);
        System.out.println("Unordered List: " + set);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(1);
        set1.add(67);
        System.out.println("Ordered List: " + set1);

        NavigableSet<Integer> set2 = new TreeSet<>();
        set2.add(12);
        set2.add(11);
        set2.add(1);
        set2.add(67);
        System.out.println(set2);
        System.out.println(set2.contains(12));
        System.out.println(set2.remove(67));
        set2.clear();
        System.out.println(set2.isEmpty());
        for (int i : set2){
            System.out.println(i);
        }

        //for thread safety
        //1.we dont use synchronized because it is complicated and the terms like Red Black Tree and AVL Tree comes
        //Set<Integer> set3 = Collections.synchronizedSet(set);

        //2.we will use concurrentskiplistset
        ConcurrentSkipListSet<Integer> set3 = new ConcurrentSkipListSet<>();
    }
}
