package Java_8.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class TerminalOperations_Filtering_CollectingNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList( "Anna" , "Panna" , "David" , "Charlie" , "bob");
        System.out.println(names.stream().filter( x -> x.length() > 4 ).toList());
    }
}
