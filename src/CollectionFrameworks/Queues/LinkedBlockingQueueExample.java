package CollectionFrameworks.Queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        //optionally bounded
        //uses two separate locks for enqueue and dequeue operations
        //Higher concurrency between producers and consumers
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    }
}
