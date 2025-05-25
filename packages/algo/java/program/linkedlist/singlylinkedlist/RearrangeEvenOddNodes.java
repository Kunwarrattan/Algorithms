package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class RearrangeEvenOddNodes {
    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();
        rearrangeEvenOdd(singlyLinkedListOperations.head);
        System.out.println();
        singlyLinkedListOperations.traverse();
    }

    public static Node<Integer> rearrangeEvenOdd(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;


        Node<Integer> odd = head;
        Node<Integer> even = head.next;
        Node<Integer> evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead; // Append even list at the end of odd list

        return head;
    }
}
