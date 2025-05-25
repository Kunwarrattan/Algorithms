package packages.algo.java.program.linkedlist.util;

public class TwoLinkedListPrograms {

    public static class Node {
        public Integer data;
        public Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void addToBeginning(Integer data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        node.next = current;
        head = node;
    }

    public void dummyIntegerData1(TwoLinkedListPrograms twoLinkedListPrograms) {
        twoLinkedListPrograms.addToBeginning(2);
        twoLinkedListPrograms.addToBeginning(3);
        twoLinkedListPrograms.addToBeginning(1);
        twoLinkedListPrograms.addToBeginning(8);
        twoLinkedListPrograms.addToBeginning(4);
        twoLinkedListPrograms.addToBeginning(14);
        twoLinkedListPrograms.addToBeginning(24);
        twoLinkedListPrograms.addToBeginning(34);
    }

    public void dummyIntegerData2(TwoLinkedListPrograms twoLinkedListPrograms) {
        twoLinkedListPrograms.addToBeginning(2);
        twoLinkedListPrograms.addToBeginning(6);
        twoLinkedListPrograms.addToBeginning(3);
        twoLinkedListPrograms.addToBeginning(9);
        twoLinkedListPrograms.addToBeginning(4);
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
}
