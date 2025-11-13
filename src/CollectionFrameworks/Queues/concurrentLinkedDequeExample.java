package CollectionFrameworks.Queues;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrentLinkedDequeExample {
    public static void main(String[] args) {
        //non blocking thread-safe double ended queue
        // CAS --> compare and swap
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element 1");
        deque.add("Element 0");
        deque.add("Element 2");
        System.out.println(deque);

        String first = deque.removeFirst();
        String last = deque.removeLast();
    }
}
