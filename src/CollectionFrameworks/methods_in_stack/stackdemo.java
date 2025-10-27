package CollectionFrameworks.methods_in_stack;

import java.util.Stack;
public class stackdemo {
    public static void main(String[] args) {
        Stack<Integer> cookie = new Stack<>();
        cookie.push(1);
        cookie.push(2);
        cookie.push(3);
        cookie.push(4);
        cookie.push(5);
        cookie.push(6);
        cookie.push(7);
        cookie.push(8);
        cookie.push(9);
        cookie.push(10);
        cookie.push(11);
        System.out.println(cookie);
        Integer RemoveElement = cookie.pop();
        System.out.println(cookie);
        Integer peek = cookie.peek();
        System.out.println(peek);
        System.out.println(cookie);
        System.out.println(cookie.isEmpty());
        System.out.println(cookie.size());

        int search = cookie.search(4);
        System.out.println(search);

    }
}
