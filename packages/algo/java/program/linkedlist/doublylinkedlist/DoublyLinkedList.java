package packages.algo.java.program.linkedlist.doublylinkedlist;

public class DoublyLinkedList {

    public Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addToNodeBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node curr = head;
        node.next = curr;
        curr.prev = node;
        node.prev = null;
        head = node;
    }

    public void traverseRight() {
        Node curr = head;
        System.out.println("");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void iterateReverse(Node head) {
        if (head == null) return;

        // Step 1: Go to the tail
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Step 2: Traverse from tail to head
        System.out.print("Reverse: ");
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    //  Delete a node in DLL
    public void deleteHead() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        curr.next.prev = null;
        head = curr.next;
        curr.next = null;
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next.prev = null;
        curr.next = null;
    }

    //Function to find pair with given sum in sorted doubly linked list

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToNodeBeginning(10);
        list.addToNodeBeginning(21);
        list.addToNodeBeginning(31);
        list.addToNodeBeginning(37);
        list.addToNodeBeginning(38);
        list.addToNodeBeginning(45);
        list.addToNodeBeginning(52);
        list.addToNodeBeginning(65);
        list.addToNodeBeginning(71);
        list.traverseRight();
        System.out.println("");
        list.iterateReverse(list.head);
        list.deleteHead();
        System.out.println("");
        list.traverseRight();
        list.deleteEnd();
        System.out.println("");
        list.traverseRight();
    }
}
