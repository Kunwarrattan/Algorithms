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

    public void findPairs(int amount) {
        Node first = head;
        Node second = head.next;
        while (second.next != null) {
            second = second.next;
        }

        while (first != null && second != null && first != second && second.next != first) {
            int sum = first.data + second.data;

            if (sum == amount) {
                System.out.println(amount + " Pair Found = " + first.data + " " + second.data);
                return;
            }

            if (sum < amount) {
                first = first.next;
            } else
                second = second.prev;
        }

        System.out.println("Dont have any pair");
    }

    public static void main(String[] args) {
        FindPairSortedDoublyLinkedList list = new FindPairSortedDoublyLinkedList();

        list.addToNodeBeginning(12);
        list.addToNodeBeginning(10);
        list.addToNodeBeginning(7);
        list.addToNodeBeginning(6);
        list.addToNodeBeginning(5);
        list.addToNodeBeginning(3);
        list.addToNodeBeginning(1);
        list.traverse();
        list.findPairs(13);
    }
}
