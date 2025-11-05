package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperation_toArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6);

        Integer[] res = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).toArray(Integer[]::new);
        System.out.println(Arrays.toString(res));

    }
}
