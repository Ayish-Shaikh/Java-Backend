package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna" , "Panna" , "David" , "Charlie" , "bob");
        Stream<String> stream = names.stream().filter( x -> {
            System.out.println("Filtering: " + x);
            return x.length() > 3;
        });
        System.out.println("Before Terminal Operation");

        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After Terminal Operation ");
        System.out.println(result);
    }
}
