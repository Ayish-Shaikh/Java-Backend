package Java_8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_CountElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2 , 3 , 5 , 7 , 11);
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);
    }
}
