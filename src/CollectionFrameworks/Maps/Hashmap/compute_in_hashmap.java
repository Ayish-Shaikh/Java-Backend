package CollectionFrameworks.Maps.Hashmap;

import java.util.HashMap;

public class compute_in_hashmap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 50);
        scores.put("Bob", 70);
        scores.put("Charlie", 40);

        System.out.println("Original Map: " + scores);

        // compute(): Recomputes value for a key (adds or updates)
        scores.compute("Alice", (key, val) -> (val == null) ? 60 : val + 10);
        System.out.println("\nAfter compute (Alice +10): " + scores);

        // computeIfPresent(): Only modifies if key exists
        scores.computeIfPresent("Bob", (key, val) -> val + 20);
        scores.computeIfPresent("David", (key, val) -> val + 20); // Won’t run
        System.out.println("\nAfter computeIfPresent (Bob +20): " + scores);

        // computeIfAbsent(): Only runs if key does NOT exist
        scores.computeIfAbsent("David", key -> 100);
        scores.computeIfAbsent("Alice", key -> 200); // Won’t run (Alice exists)
        System.out.println("\nAfter computeIfAbsent (add David=100): " + scores);
    }
}