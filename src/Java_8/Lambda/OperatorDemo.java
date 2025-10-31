package Java_8.Lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x , y) -> x + y;
        System.out.println(a.apply(6));
        System.out.println(b.apply(6,2));
    }
}
