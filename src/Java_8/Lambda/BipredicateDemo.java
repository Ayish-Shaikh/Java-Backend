package Java_8.Lambda;

import java.util.function.BiPredicate;

public class BipredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isEven = (x , y ) -> (x + y) % 2 == 0;
        System.out.println(isEven.test(15 , 15));
    }
}
