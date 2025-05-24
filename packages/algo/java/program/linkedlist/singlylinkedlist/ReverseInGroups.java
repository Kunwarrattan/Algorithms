package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class ReverseInGroups {

    Node reverse(Node node, int k) {
        Node prev = null;
        Node curr = node;
        Node next = null;

        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            node.next = reverse(next, k);
        }

        return prev;
    }

    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

        ReverseInGroups reverse = new ReverseInGroups();
        singlyLinkedListOperations.head = reverse.reverse(singlyLinkedListOperations.head, 3);
        System.out.println("");
        singlyLinkedListOperations.traverse();
    }
}
