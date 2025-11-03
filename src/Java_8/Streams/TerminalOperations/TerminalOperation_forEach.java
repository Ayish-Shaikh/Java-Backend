package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class TerminalOperation_forEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        list.stream().forEach(x -> System.out.println(x));
    }
}
