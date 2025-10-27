package CollectionFrameworks.methods_in_LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        // LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);     // O(1)
        numbers.addLast(40);     // O(1)

        System.out.println("Original LinkedList: " + numbers);

        // Accessing elements
        System.out.println("First Element: " + numbers.getFirst());
        System.out.println("Last Element: " + numbers.getLast());
        System.out.println("Element at index 2: " + numbers.get(2));

        // Using removeIf() - Lambda function to remove even/odd numbers
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After removeIf (removed even numbers): " + numbers);

        // LinkedList of Strings using Arrays.asList()
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry", "Mango"));
        System.out.println("\nFruits LinkedList: " + fruits);

        // Using addAll() to add more fruits
        fruits.addAll(Arrays.asList("Orange", "Grapes"));
        System.out.println("After addAll(): " + fruits);

        // Using removeAll() to remove specific elements
        LinkedList<String> removeList = new LinkedList<>(Arrays.asList("Banana", "Cherry"));
        fruits.removeAll(removeList);
        System.out.println("After removeAll(): " + fruits);

        // Sorting the LinkedList
        Collections.sort(fruits);
        System.out.println("After Sorting: " + fruits);

        // Using Lambda Expression to print all elements
        System.out.println("\nDisplaying using Lambda:");
        fruits.forEach(fruit -> System.out.println("🍎 " + fruit));
    }
}