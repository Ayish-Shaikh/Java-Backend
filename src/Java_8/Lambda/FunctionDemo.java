package Java_8.Lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function --> work for you
        Function<Integer , Integer> doubleIt = x -> 2 * x;
        Function<Integer , Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));//first doubleIt is done then tripleIt --> 2 * 20 = 40 * 3 = 120  "andThen"
        System.out.println(doubleIt.compose(tripleIt).apply(20));//first tripleIt is done then doubleIt --> 3 * 20 = 60 * 2 = 120  "compose"
        System.out.println(doubleIt.apply(100));
        Function<Integer,Integer> identity = Function.identity();
        Integer res = identity.apply(5);
        System.out.println(res);
    }
}
