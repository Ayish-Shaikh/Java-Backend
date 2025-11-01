package Java_8.Streams;

import java.util.stream.Stream;

public class streamInfiniteDemo {
    public static void main(String[] args) {
        //generating infinite numbers using math.random method
        Stream.generate(Math::random).limit(10).forEach(System.out::println);//method reference
    }
}
