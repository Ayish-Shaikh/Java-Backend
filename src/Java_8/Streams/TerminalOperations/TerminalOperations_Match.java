package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class TerminalOperations_Match {
    public static void main(String[] args) {

        //anyMatch
        List<Integer> list = Arrays.asList(1 , 2 , 3);

        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        //allMatch
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        //noneMatch
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);
    }
}
