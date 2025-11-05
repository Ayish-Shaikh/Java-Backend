package Java_8.Collectors;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_SprecificCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice" , "Bob" , "Charlie");
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect);
    }
}
