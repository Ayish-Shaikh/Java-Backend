package Java_8.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        //feature introduced in java 8
        //process collections of data in a functional and declarative manner
        //simplify Data Processing
        //Embrace Readability and Maintainability
        //Enable Easy Parallelism

        //What is Stream?
        //a sequence of elements supporting functional and declarative programing

        //How to Use Streams?
        //Source, intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());


    }
}
