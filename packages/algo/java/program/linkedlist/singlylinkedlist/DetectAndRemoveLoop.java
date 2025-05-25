package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class DetectAndRemoveLoop {

    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> cycleOperation = new LinkedListBasicOperations<>();
        cycleOperation.dummyCycleIntegerData(cycleOperation);

        findAndRemoveCycle(cycleOperation.head);
        Node curr = cycleOperation.head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    private static void findAndRemoveCycle(Node<Integer> head) {
        Node slow = head;
        Node fast = head;
        boolean cycleDetected = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleDetected = true;
                break;
            }
        }
        if (!cycleDetected) {
            System.out.println("No cycle Found");
            return;
        }

        // Step 2: Find the start of the cycle
        slow = head;
        Node prev = null; // to keep track of node before fast
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the cycle
        if (prev != null) {
            prev.next = null;
        }
        System.out.println("Cycle removed at node with data: " + slow.data);
    }

}
