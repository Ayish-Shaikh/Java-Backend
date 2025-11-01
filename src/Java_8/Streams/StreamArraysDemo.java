package Java_8.Streams;

import java.util.Arrays;

public class StreamArraysDemo {
    public static void main(String[] args) {
        String[] languages = {"Java", "Dsa", "Erlang"};
        //method reference --> Arrays.stream(languages).forEach(x -> System.out.println(x)) Then press alt+enter
        Arrays.stream(languages).forEach(System.out::println);
    }
}
