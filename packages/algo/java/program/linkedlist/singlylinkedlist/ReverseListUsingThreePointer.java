package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class ReverseListUsingThreePointer {

    public void reverse(LinkedListBasicOperations<Integer> singlyLinkedListOperations) {

        Node current = singlyLinkedListOperations.head;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        singlyLinkedListOperations.head = prev;
    }

    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

        ReverseListUsingThreePointer reverseListUsingThreePointerMethod = new ReverseListUsingThreePointer();
        System.out.println("");
        reverseListUsingThreePointerMethod.reverse(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

    }
}
