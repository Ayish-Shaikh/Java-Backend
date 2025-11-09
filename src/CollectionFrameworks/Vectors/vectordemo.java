package CollectionFrameworks.Vectors;

import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(2);
        System.out.println(vector.capacity());

        Vector<Integer> vector1 = new Vector<>(vector);
        System.out.println(vector1);
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }
        vector1.clear();
        System.out.println(vector1);


        //example of Checking the vector is thread safe
        Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size()); // Output: 2000


    }
}