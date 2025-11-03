package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class Summing_Values {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1 , 2 , 3 , 4 , 5);
        System.out.println(numbers.stream().reduce(Integer::sum).get());
    }
}
