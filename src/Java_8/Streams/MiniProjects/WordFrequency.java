package Java_8.Streams.MiniProjects;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {

        //Count how many times each word appears in the paragraph
        String text = "linga guli guli watcha linga gu linga gu";
        System.out.println(Arrays.stream(text.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
    }
}
