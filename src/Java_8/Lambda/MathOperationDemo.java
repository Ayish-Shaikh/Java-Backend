package Java_8.Lambda;

public class MathOperationDemo {
    public static void main(String[] args) {
        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation substrationOperation = ( a , b) -> a - b;
        int add = sumOperation.operate( 1  , 2);
        int subs = substrationOperation.operate(5,3);
        System.out.println(add);
        System.out.println(subs);
    }
}
interface MathOperation {
    int operate(int a, int b);
}