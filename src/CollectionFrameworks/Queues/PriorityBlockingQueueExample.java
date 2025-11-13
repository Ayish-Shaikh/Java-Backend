package CollectionFrameworks.Queues;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        //unbounded
        //Binary Heap as array and can grow dynamically
        //Elements are ordered based on their natural ordering or a provided comparator like priority queue
        //put wont block
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        System.out.println(queue);
    }
}
