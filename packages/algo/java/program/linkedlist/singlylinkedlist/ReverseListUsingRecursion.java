package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

import java.util.function.BiConsumer;

public class ReverseListUsingRecursion {

    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node newHead = reverse(node.next);

        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

        ReverseListUsingRecursion reverseListUsingRecursion = new ReverseListUsingRecursion();
        singlyLinkedListOperations.head = reverseListUsingRecursion.reverse(singlyLinkedListOperations.head);
        System.out.println("");
        singlyLinkedListOperations.traverse();
    }
}
