package Java_8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_Mapping_Collecting {
    public static void main(String[] args) {
        // Applies a mapping function before collecting
        List<String> words = Arrays.asList("hello" , "world" , "java" , "is" , "objectoriented" , "programming" , "language");
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase() , Collectors.toList())));
    }
}
