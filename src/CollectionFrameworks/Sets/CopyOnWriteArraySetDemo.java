package CollectionFrameworks.Sets;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread safe
        //copy on write Mechanism
        //No Duplicate Elements
        //Iterators Do not Reflect Modifications
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i = 1; i <= 5; i++){
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListMap: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet){
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            //Attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }

        //we say concurrent skip list set is weakly consistent because when iterating it may or may not reflect which i may print or may not
        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            //Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }
//when to use CopyOnWriteArraySet and ConcurrentSkipListSet
        //CopyOnWriteArraySet -->if there is Read intensive and write is less, if we want to iterate the elements we need stability then we will use CopyOnWriteArraySet
        //ConcurrentSkipListSet --> if there is frequent read and writes then we will use concurrentSkipListSet
    }
}
