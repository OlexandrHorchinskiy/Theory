package collections.list.linkedList;
/*
 * geeksforgeeks.org/linkedlist-descendingiterator-method-in-java-with-examples/
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrintInReverseOrder {
    public static void main(String[] args) {
        LinkedList<Integer> source = new LinkedList<Integer>();

        // добавка элементів
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(4);
        source.add(5);

        // друк списку
        System.out.println("LinkedList:" + source.toString());

        // set Iterator as descending
        // using descendingIterator() method
        Iterator iterator = source.descendingIterator();

        // друк списку в зворотньому порядку
        System.out.print("Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}