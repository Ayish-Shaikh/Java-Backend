package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations_Limit {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ayish", "Abhi", "Gpt", "Groq", "Gpt");
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());
    }
}
