package Java_8.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamCollectionsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ayish", "Abir", "Java");

        names.stream().forEach(System.out::println);
    }
}
