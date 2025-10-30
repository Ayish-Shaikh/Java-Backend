package CollectionFrameworks.Maps.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class CheckingThreadSafe {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();//Hashtable is thread safe whereas hashmap is not thread safe
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                map.put(i,"Thread1");
            }
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 1000; i < 2000; i++) {
                map.put(i,"Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final size of the HashTable: " + map.size());



        HashMap<Integer, String> map1 = new HashMap<>();//Hashtable is thread safe whereas hashmap is not thread safe
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                map1.put(i,"Thread1");
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 1000; i < 2000; i++) {
                map1.put(i,"Thread2");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final size of the HashMap: " + map1.size());
    }
}