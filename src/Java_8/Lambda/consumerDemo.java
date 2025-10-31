package Java_8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(67);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);
    }
}
