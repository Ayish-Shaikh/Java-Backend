package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class TerminalOperartion_forEachOrdered {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 , 2 ,  3 ,  4 , 5 , 6 , 7 , 8 , 9 , 10);
        System.out.println("Using forEach with parallel stream: ");
        numbers.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream: ");
        numbers.parallelStream().forEachOrdered(System.out::println);

    }
}
