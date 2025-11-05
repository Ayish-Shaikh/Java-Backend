package Java_8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_CalculatingAverages {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2 , 3 , 5 , 7 , 11);
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);
    }
}
