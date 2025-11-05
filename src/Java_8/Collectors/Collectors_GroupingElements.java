package Java_8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Collectors_GroupingElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello" , "world" , "java" , "streams" , "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length , Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length , Collectors.counting())));
        TreeMap<Integer, Long> tree = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(tree);
    }
}
