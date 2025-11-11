package CollectionFrameworks.Queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // part of the queue interface
        // orders elements based on their natural ordering(for primitives lowest first)
        //custom comparators for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq.peek());
        System.out.println(pq);//not sorted
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        //PriorityQueue<Integer> pq1 = new PriorityQueue<>( (x , y) -> y - x);// reverse ordering
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());// reverse ordering
        pq1.add(15);
        pq1.add(10);
        pq1.add(30);
        pq1.add(5);
        System.out.println(pq1);
        //internal working
        //Priority Queue is implemented as a min-heap by default (for natural ordering)
    }
}
