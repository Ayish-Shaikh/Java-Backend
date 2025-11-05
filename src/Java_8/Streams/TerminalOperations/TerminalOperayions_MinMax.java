package Java_8.Streams.TerminalOperations;

import java.util.Comparator;
import java.util.stream.Stream;

public class TerminalOperayions_MinMax {
    public static void main(String[] args) {
        System.out.println("max: " + Stream.of( 2 , 12 , 22 , 33 , 44).max((a,b) -> a - b).get());
        System.out.println("min: " + Stream.of( 2 , 12 , 22 , 33 , 44).min(Comparator.naturalOrder()).get());
    }
}
