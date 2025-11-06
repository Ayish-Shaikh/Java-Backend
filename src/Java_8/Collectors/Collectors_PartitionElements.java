package Java_8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_PartitionElements {
    public static void main(String[] args) {
    // Partitions elements into two groups (true and false) based on a predicate
        List<String> words = Arrays.asList("hello" , "world" , "java" , "streams" , "collecting");
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
    }
}
