package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.Node;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        Node common = new Node<>(8);
        common.next = new Node(10);

        Node headA = new Node(3);
        headA.next = new Node(27);
        headA.next.next = new Node(17);
        headA.next.next.next = new Node(67);
        headA.next.next.next.next = common;

        Node headB = new Node(99);
        headB.next = new Node(1);
        headB.next.next = common;

        printList(headA);
        printList(headB);

        Node intersectionPoint = findIntersection(headA, headB);
        System.out.println("\nPoint = " + intersectionPoint.data);
    }

    private static Node findIntersection(Node headA, Node headB) {
        Node ptr1 = headA;
        Node ptr2 = headB;

        while (ptr1 != ptr2) {
            ptr1 = (ptr1 == null) ? headB : ptr1.next;
            ptr2 = (ptr2 == null) ? headA : ptr2.next;
        }

        return ptr1;
    }

    private static void printList(Node head) {
        Node curr = head;
        System.out.println("");
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }
}
