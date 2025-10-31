package Java_8.Lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ayish", "Abir", "Chowli");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);  // :: is method reference

    }
}
