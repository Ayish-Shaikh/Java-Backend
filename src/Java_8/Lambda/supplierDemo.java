package Java_8.Lambda;

import java.util.function.Supplier;

public class supplierDemo {
    public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());
    }
}
