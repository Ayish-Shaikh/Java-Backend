package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations_reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum); //(x, y) -> x + y --> it is called the accumulator and by clicking alt+enter we can change it to method reference.
        System.out.println(optionalInteger.get());
    }
}
