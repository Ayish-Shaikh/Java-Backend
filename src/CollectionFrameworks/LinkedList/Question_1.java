package CollectionFrameworks.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Question_1 {

//Insert in a sorted Linked List

//using collection
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();

            linkedList.add(10);
            linkedList.add(30);
            linkedList.add(50);
            linkedList.add(60);
            linkedList.add(90);
            linkedList.add(1000);
            System.out.println("Old LinkedList " + linkedList);

            LinkedList<Integer> newlinkedlist = insertSortedLL(linkedList, 70);
            System.out.println("New LinkedList " + newlinkedlist);
        }

        public static LinkedList<Integer> insertSortedLL(LinkedList<Integer> linkedList, int value) {

            linkedList.add(value);
            Collections.sort(linkedList);
            return linkedList;

        }
    }