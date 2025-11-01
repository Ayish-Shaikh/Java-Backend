package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations_Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ayish", "Abhi", "gpt", "groq");
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        stringStream.forEach(System.out::println);
    }
}
