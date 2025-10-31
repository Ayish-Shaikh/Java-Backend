package Java_8.Lambda;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (x , y) ->(x + y).toUpperCase();
        System.out.println(biFunction.apply( "a" , "bc"));
        BiFunction<Integer, Integer, Integer> addition = (num1, num2) -> num1 + num2;
        int result = addition.apply(10, 20);
        System.out.println("Addition: " + result);
    }
}
