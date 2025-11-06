package Java_8.Collectors.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_creatingmap {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "grapes");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
    }
}
