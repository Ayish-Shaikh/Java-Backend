package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations_sorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ayish", "Abhi", "gpt", "groq");
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStream1UsingComparator = list.stream().sorted((a , b) -> a.length() - b.length());
        sortedStream.forEach(System.out::println);
        sortedStream1UsingComparator.forEach(System.out::println);
    }
}
