package Java_8.Streams.TerminalOperations;

import java.util.stream.IntStream;

public class Counting_Occurences_of_a_character {
    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter( x -> x == 'l').count());
    }
}
