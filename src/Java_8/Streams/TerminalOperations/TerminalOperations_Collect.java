package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations_Collect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 , 3);


        list.stream().skip(1).collect(Collectors.toList()).forEach(System.out::println);
    }
}
