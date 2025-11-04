package Java_8.Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to precess parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1 , x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime-startTime) + "ms");

        startTime = System.currentTimeMillis();
        factorialsList = list.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime-startTime) + "ms");

        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets
    }
    private static long factorial(int n){
        long res = 1;
        for (int i = 2; i <= n ; i++) {
            res *= i;
        }
        return res;
    }
}
