package Java_8.Collectors.Examples;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors_StringValues {
    public static void main(String[] args) {
        Map<String , Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 24);
        items.put("Graprs", 32);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));
    }
}
