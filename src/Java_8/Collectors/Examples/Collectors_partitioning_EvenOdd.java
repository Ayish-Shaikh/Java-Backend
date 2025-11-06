package Java_8.Collectors.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_partitioning_EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
    }
}
