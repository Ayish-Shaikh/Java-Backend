package CollectionFrameworks.Maps.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        System.out.println(System.identityHashCode(key1));//generates a new hash code for first key if we are using identity hash map
        System.out.println(System.identityHashCode(key2));//generates a new hash code for second key if we are using identity hash map
        System.out.println(key1.hashCode());// the hash code will be same for both key 1 and key 2
        System.out.println(key2.hashCode());
        Map<String,Integer> map = new IdentityHashMap<>();
        map.put(key1, 6);
        map.put(key2, 4);
        System.out.println(map);
    }
}
