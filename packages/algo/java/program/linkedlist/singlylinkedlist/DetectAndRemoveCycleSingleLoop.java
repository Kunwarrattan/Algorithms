package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class DetectAndRemoveCycleSingleLoop {
    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> cycleOperation = new LinkedListBasicOperations<>();
        cycleOperation.dummyCycleIntegerData(cycleOperation);

        detectAndRemoveCycleSingleLoop(cycleOperation.head);
        cycleOperation.traverse();
    }

    private static void detectAndRemoveCycleSingleLoop(Node<Integer> head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;
        Node prevFast = null; // To keep track of previous node of fast

        while (fast != null && fast.next != null) {
            slow = slow.next;
            prevFast = fast.next;  // node before fast moves
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected, now break the loop directly
                System.out.println("Cycle detected at node: " + slow.data);

                // To remove cycle directly in this loop:
                // Move one pointer to head and both step by 1
                // Track the previous node to break the loop
                Node ptr1 = head;
                Node ptr2 = fast;

                Node prev = null; // To store node before ptr2 (fast)

                while (ptr1 != ptr2) {
                    ptr1 = ptr1.next;
                    prev = ptr2;
                    ptr2 = ptr2.next;
                }

                // ptr1 == ptr2 is the start of the loop
                // prev is the last node of the loop
                if (prev != null) {
                    prev.next = null; // Break the loop
                    System.out.println("Cycle removed at node: " + prev.data);
                }
                return;
            }
        }

        System.out.println("No cycle detected.");
    }

}
