package CollectionFrameworks.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //so what is Queue ? --> Its a data structure which works on FIFO concept i.e. first in first out
        //Elements are added at the end and removed from the front.
        //we can use linked list to perform both stack and queue
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(69);
        System.out.println(list);
        Integer i1 = list.removeFirst();
        System.out.println(i1);

        //enqueue
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(7);
        list1.addLast(8);
        System.out.println(list1);

        //dequeue
        Integer i2 = list1.removeFirst();
        System.out.println(i2);

        //peek
        Integer first = list1.getFirst();
        System.out.println(first);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("\n using queue interfaces");
        System.out.println("Done by queue" + queue);

        //using queue interface to enqueue deque peek
        Queue<Integer> queue1 = new LinkedList<>();

        //enequeue
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        System.out.println("Enqueue done with queue interfaces: " + queue1);

        //dequeue
        Integer remove = queue1.remove();
        System.out.println("Dequeue done with queue interface: " + remove);

        //peek
        Integer peek = queue1.peek();
        System.out.println("Peek done with queue interface: " + peek);
    }
}
