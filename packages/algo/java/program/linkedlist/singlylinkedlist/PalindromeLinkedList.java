package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;
import packages.algo.java.program.linkedlist.util.Node;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        LinkedListBasicOperations<Integer> singlyLinkedListOperations = new LinkedListBasicOperations<>();
        LinkedListBasicOperations<Integer> list1 = new LinkedListBasicOperations<>();
        list1.addToBeginning(4);
        list1.addToBeginning(14);
        list1.addToBeginning(19);
        list1.addToBeginning(14);
        list1.addToBeginning(4);
        list1.traverse();
        System.out.println();

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        palindromeLinkedList.checkPalindrome(list1.head);


    }

    private void checkPalindrome(Node<Integer> head) {
        Node firstHalf = head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = secondHalf(slow.next);
        while (secondHalf != null) {
            if (secondHalf.data != firstHalf.data) {
                System.out.println("not a palindrome");
                break;
            } else {
                secondHalf = secondHalf.next;
                firstHalf = firstHalf.next;
            }
        }
        System.out.println("Palindrome");
    }

    private static Node secondHalf(Node head) {
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}
