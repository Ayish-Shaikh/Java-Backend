package Java_8.Streams.ParallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CumulativeSum {
    public static void main(String[] args) {
        // [1 , 2 , 3 , 4 , 5] --> [1 , 3 , 6 , 10 , 15]
        List<Integer> numbers = Arrays.asList(1 , 2 , 3 , 4 , 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.stream().sequential().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum: [1 , 3 , 6 , 10 , 15]");
        System.out.println("Actual result with parallel stream: " + cumulativeSum);
    }
}
