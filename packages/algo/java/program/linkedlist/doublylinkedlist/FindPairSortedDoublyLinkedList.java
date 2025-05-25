package packages.algo.java.program.linkedlist.doublylinkedlist;

public class FindPairSortedDoublyLinkedList {

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

    public void traverse() {
        Node curr = head;
        System.out.println("");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        FindPairSortedDoublyLinkedList list = new FindPairSortedDoublyLinkedList();
        list.addToNodeBeginning(1);
        list.addToNodeBeginning(3);
        list.addToNodeBeginning(5);
        list.addToNodeBeginning(6);
        list.addToNodeBeginning(7);
        list.addToNodeBeginning(10);
        list.addToNodeBeginning(12);
    }
}
