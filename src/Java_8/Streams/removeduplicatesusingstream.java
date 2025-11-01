package Java_8.Streams;

import java.util.Arrays;

public class removeduplicatesusingstream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] result = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(result));
    }
}