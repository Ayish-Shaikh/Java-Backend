package Java_8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_JoiningString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice" , "Bob" , "Charlie");
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(" , "));
        System.out.println(concatenatedNames);
    }
}
