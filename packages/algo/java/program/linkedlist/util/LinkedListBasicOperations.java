package packages.algo.java.program.linkedlist.util;

public class LinkedListBasicOperations<T> {
    public Node<T> head;

    public void addToEnd(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void addToBeginning(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        node.next = current;
        head = node;
    }

    public boolean deleteFromEnd() {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            head = null;
            return true;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return true;
    }

    public boolean deleteFromBeginning() {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            head = null;
            return true;
        }
        Node current = head;
        head = current.next;
        current = null;

        return true;
    }

    public void traverse() {
        Node current = head;
        if (head == null)
            return;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void dummyIntegerData(LinkedListBasicOperations<Integer> listBasicOperations) {
        listBasicOperations.addToBeginning(10);
        listBasicOperations.addToBeginning(20);
        listBasicOperations.addToBeginning(130);
        listBasicOperations.addToBeginning(40);
        listBasicOperations.addToBeginning(11);
        listBasicOperations.addToBeginning(12);
        listBasicOperations.addToBeginning(9);
        listBasicOperations.addToEnd(13);
        listBasicOperations.addToEnd(121);
        listBasicOperations.addToEnd(13);
        listBasicOperations.addToEnd(122);
        listBasicOperations.addToEnd(54);
        listBasicOperations.addToEnd(3);
        listBasicOperations.addToEnd(32);
    }

    public void dummyCycleIntegerData(LinkedListBasicOperations<Integer> listBasicOperations) {

        listBasicOperations.addToBeginning(40);
        listBasicOperations.addToBeginning(11);
        listBasicOperations.addToBeginning(12);
        listBasicOperations.addToBeginning(232);
        listBasicOperations.addToEnd(13);
        listBasicOperations.addToEnd(121);
        listBasicOperations.addToEnd(3);
        listBasicOperations.addToEnd(32);

        Node curr = head;
        int count = 0;
        Node temp = null;
        while (curr.next != null) {
            if (count == 3) {
                temp = curr;
            }
            count++;
            curr = curr.next;
        }
        curr.next = temp;
    }

}
