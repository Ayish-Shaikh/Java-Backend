package Java_8.Collectors.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_mergingtoMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");
        System.out.println(list.stream().collect(Collectors.toMap(k->k,v->1, (x, y) -> x + y)));
    }
}
