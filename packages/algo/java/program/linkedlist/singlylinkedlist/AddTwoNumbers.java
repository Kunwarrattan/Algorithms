package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.TwoLinkedListPrograms;

//Add two numbers represented as linked lists
public class AddTwoNumbers {

    public static void main(String[] args) {
        TwoLinkedListPrograms list1 = new TwoLinkedListPrograms();
        list1.dummyIntegerData1(list1);

        TwoLinkedListPrograms list2 = new TwoLinkedListPrograms();
        list2.dummyIntegerData2(list2);

        list1.traverse();
        System.out.println("");
        list2.traverse();

        TwoLinkedListPrograms.Node node = addTwoNumbers(list1.head, list2.head);
        System.out.println("");
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static TwoLinkedListPrograms.Node addTwoNumbers(TwoLinkedListPrograms.Node head, TwoLinkedListPrograms.Node head1) {
        TwoLinkedListPrograms.Node dummyHead = new TwoLinkedListPrograms.Node(0); // dummy node
        TwoLinkedListPrograms.Node p = head, q = head1, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0; // value from l1
            int y = (q != null) ? q.data : 0; // value from l2
            int sum = carry + x + y;
            carry = sum / 10;  // calculate new carry

            curr.next = new TwoLinkedListPrograms.Node(sum % 10); // create new node
            curr = curr.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // handle carry left at the end
        if (carry > 0) {
            curr.next = new TwoLinkedListPrograms.Node(carry);
        }

        return dummyHead.next;
    }


}
