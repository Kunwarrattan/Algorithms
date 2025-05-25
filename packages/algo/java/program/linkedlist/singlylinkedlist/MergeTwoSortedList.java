package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> list1 = new LinkedListBasicOperations<>();
        list1.addToBeginning(114);
        list1.addToBeginning(28);
        list1.addToBeginning(19);
        list1.addToBeginning(14);
        list1.addToBeginning(4);
        list1.traverse();
        System.out.println();
        LinkedListBasicOperations<Integer> list2 = new LinkedListBasicOperations<>();
        list2.addToBeginning(333);
        list2.addToBeginning(233);
        list2.addToBeginning(133);
        list2.addToBeginning(33);
        list2.addToBeginning(23);
        list2.addToBeginning(13);
        list2.addToBeginning(9);
        list2.addToBeginning(3);
        list2.traverse();

        MergeTwoSortedList.merge(list1.head, list2.head);

    }

    private static Node merge(Node<Integer> node1, Node<Integer> node2) {
        Node<Integer> dummy = new Node<>(0); // dummy head
        Node<Integer> tail = dummy;

        // Merge two sorted linked lists
        while (node1 != null && node2 != null) {
            if (node1.data <= node2.data) {
                tail.next = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
            }
            tail = tail.next;
        }

        if (node1 != null) {
            tail.next = node1;
        } else if (node2 != null) {
            tail.next = node2;
        }
        System.out.println();

        Node<Integer> curr = dummy.next;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();

        return dummy.next;
    }
}
