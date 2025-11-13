package CollectionFrameworks.Queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class concurrentLinkedQueueExample {
    //An implementation of the Queue interface that supports lock-free, thread safe operations
    public class TaskSubmissionSystem{
        private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

        public static void main(String[] args) {

            Thread producer = new Thread(() -> {
                while(true){
                    try {
                        taskQueue.add("Task " + System.currentTimeMillis());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

            Thread consumer = new Thread(() -> {
                while(true){
                    try {
                        String task = taskQueue.poll();
                        System.out.println("processing: " + task);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
            producer.start();
            consumer.start();
        }
    }
}
