package CollectionFrameworks.Queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // thread safe queue
        // wait for queue to become non-empty / wait for space
        //simplify concurrency problems like produce-consumer
        //standard queue --> immediately
            //empty --> remove(no waiting)
            //full --> add (no waiting)
        //Blocking queue
            //put --> Blocks if the queue is full until space becomes available
            //take --> Blocks if the queue is empty until an element becomes available
            //offer --> Waits for space to become available, up to the specified timeout

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        //A bounded, blocking queue backed by an array

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }
}
class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("producer produced: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Consumer interrupted");
            }

        }
    }
}
class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                Integer value = queue.take();
                System.out.println("producer produced: " + value);
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println("Consumer interrupted");
            }

        }
    }
}