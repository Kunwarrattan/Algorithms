package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class RemoveNthNode {

    public void removeNthNode(Node node, int index) {
        Node slow = node;
        Node fast = node;
        for (int i = 0; i <= index; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

    }

    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

        System.out.println("");
        RemoveNthNode removeNthNode = new RemoveNthNode();
        removeNthNode.removeNthNode(singlyLinkedListOperations.head, 2);
        singlyLinkedListOperations.traverse();
    }
}
