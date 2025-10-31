package Java_8.Lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //Predicate --> Functional Interface (Boolean valued function)

        Predicate<Integer> isEven = x -> x % 2 == 0 ;
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithH = x -> x.toLowerCase().endsWith("h");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithH);
        System.out.println(and.test("Ayish"));

        Predicate<String> convertedtoUpper = x -> x.toUpperCase().equals(x);
        System.out.println(convertedtoUpper.test("AYISH"));

    }
}
