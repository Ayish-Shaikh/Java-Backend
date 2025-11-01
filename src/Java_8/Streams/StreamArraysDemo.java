package Java_8.Streams;

import java.util.Arrays;

public class StreamArraysDemo {
    public static void main(String[] args) {
        String[] languages = {"Java", "Dsa", "Erlang"};
        Arrays.stream(languages).forEach(System.out::println);
    }
}
