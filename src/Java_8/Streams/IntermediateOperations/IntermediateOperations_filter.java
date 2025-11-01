package Java_8.Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations_filter {
    public static void main(String[] args) {
        //Intermediate Operations transform a stream into another stream
        //They are lazy,meaning they dont execute until a terminal operation is invoked

        List<String> list = Arrays.asList("Ayish", "Abir", "Pat", "Chowli");
        Stream<String> filteredString = list.stream().filter(x -> x.startsWith("A"));
        //no filtering at this point
        long res = list.stream().filter(x -> x.startsWith("A")).count();

        System.out.println(res);

    }
}
