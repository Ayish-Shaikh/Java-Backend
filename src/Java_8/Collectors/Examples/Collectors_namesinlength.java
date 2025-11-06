package Java_8.Collectors.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_namesinlength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bob" , "anna", "alex", "brian", "alice", "joffrey");
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));

    }
}
