package CollectionFrameworks.Stack;

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
        //10 -->1
        //9 -->2
        //8 -->3
        //7 -->4 it is the element 4 after searching
        //6
        //5
        //4
        //3
        //2
        //1
    }
}
