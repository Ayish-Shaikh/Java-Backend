package Java_8.Collectors.Examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Collectors_countingword {
    public static void main(String[] args) {
        String sentence = "hello world i am learning java 8 streams";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x , Collectors.counting())));
    }
}
