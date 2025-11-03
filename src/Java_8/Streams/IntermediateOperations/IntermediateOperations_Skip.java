package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperations_Skip {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ayish", "Abhi", "Groq", "Gpt", "Gemini", "Olama");
        list.stream().skip(3).forEach(System.out::println);

        IntStream.range(1, 10).skip(5).forEach(System.out::println);//skipping from the element 5
    }
}
