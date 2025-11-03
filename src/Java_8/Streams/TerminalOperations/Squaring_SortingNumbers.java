package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class Squaring_SortingNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 5 , 3 , 4 , 7 , 2 , 1 , 6);
        System.out.println(numbers.stream().map( x -> x * x).sorted().toList());


    }
}
