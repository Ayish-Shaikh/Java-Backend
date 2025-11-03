package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class TerminalOperations_Find {
    public static void main(String[] args) {

        //findFirst

        List<Integer> list = Arrays.asList(1 , 2 , 3);
        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findAny().get());
    }
}
