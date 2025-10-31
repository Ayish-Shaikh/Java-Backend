package Java_8.Lambda;

public class Question_1 {
    public static void main(String[] args) {
        //lambda expression
        //lambda expression is an anonymous function (no name, no return type, no access modifier)
        Thread t1 = new Thread(() ->{
            System.out.println("hello");
        });

        System.out.println(t1.isAlive());
        System.out.println(t1.getName());
    }
}
