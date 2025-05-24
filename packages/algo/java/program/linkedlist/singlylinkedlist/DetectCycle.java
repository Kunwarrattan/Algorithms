package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class DetectCycle {


    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        singlyLinkedListOperations.dummyIntegerData(singlyLinkedListOperations);
        singlyLinkedListOperations.traverse();

        DetectCycle detectCycle = new DetectCycle();
        detectCycle.detectCycle(singlyLinkedListOperations.head);

        LinkedListBasicOperations<Integer> cycleOperation = new LinkedListBasicOperations<>();
        cycleOperation.dummyCycleIntegerData(cycleOperation);

        detectCycle.detectCycle(cycleOperation.head);

    }

    private void detectCycle(Node<Integer> head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println(" Cycle Found at " + fast.data);
                break;
            }
        }
        System.out.println("No cycle Found");
    }
}
