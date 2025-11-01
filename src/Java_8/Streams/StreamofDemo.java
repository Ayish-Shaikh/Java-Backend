package Java_8.Streams;

import java.util.stream.Stream;

public class StreamofDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVASCRIPT");
        stream.forEach(System.out::println);//method reference

    }
}
