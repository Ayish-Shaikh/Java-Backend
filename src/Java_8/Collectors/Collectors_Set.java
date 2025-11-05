package Java_8.Collectors;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectors_Set {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1 , 2 , 2 , 3 , 4 , 4 , 5 , 6 , 6 , 7);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);
    }
}
