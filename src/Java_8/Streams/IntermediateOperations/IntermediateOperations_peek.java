package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations_peek {
    public static void main(String[] args) {
        //Performs an action on each element as it is consumed.
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Ashish", "Bob", "Prime");
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();
    }
}
