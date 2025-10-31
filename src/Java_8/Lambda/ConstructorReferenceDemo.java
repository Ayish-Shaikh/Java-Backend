package Java_8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        //constructor reference
        List<String> names = Arrays.asList("Samsung" , "Vivo" , "Infinix" , "Nothing");
        names.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(names);
    }
}
class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}