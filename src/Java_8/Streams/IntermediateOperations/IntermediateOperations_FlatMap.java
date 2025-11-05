package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperations_FlatMap {
    public static void main(String[] args) {
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listoflists = Arrays.asList(
                Arrays.asList("apple" , "banana"),
                Arrays.asList("orange" , "kiwi"),
                Arrays.asList("mango" , "watermelon")
        );
        System.out.println(listoflists.get(2).get(0));
        System.out.println(listoflists
                .stream()
                .flatMap( x -> x.stream())
                .map(String::toUpperCase)
                .toList());
        List<String> sentence = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentence
                .stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(String::toUpperCase)
                .toList());
    }
}
