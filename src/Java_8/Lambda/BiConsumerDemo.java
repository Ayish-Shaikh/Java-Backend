package Java_8.Lambda;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,String> printDetails = (age , name) -> System.out.println(age + " " + name);
        printDetails.accept(20,"Ayish");
    }
}
