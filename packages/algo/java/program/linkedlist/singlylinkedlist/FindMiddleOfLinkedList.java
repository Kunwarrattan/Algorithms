package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class FindMiddleOfLinkedList {

    public static void main(String[] args) {

        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

        FindMiddleOfLinkedList findMiddleOfLinkedList = new FindMiddleOfLinkedList();
        findMiddleOfLinkedList.findMiddle(singlyLinkedListOperations.head);
    }

    private void findMiddle(Node<Integer> head) {
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle = " + slow.data);
    }
}
