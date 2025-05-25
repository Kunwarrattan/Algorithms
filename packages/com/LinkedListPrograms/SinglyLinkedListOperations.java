package packages.com.LinkedListPrograms;

public class SinglyLinkedListOperations {

    public Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public boolean delete(int value) {
        if (head == null) {
            return false;
        } else if (head.data == value) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) return false;

        current.next = current.next.next;
        return true;
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Recursive reverse helper
    private Node reverseRecursive(Node current) {
        if (current == null || current.next == null) {
            return current;
        }

        Node newHead = reverseRecursive(current.next);
        current.next.next = current;
        current.next = null;
        return newHead;
    }

    public void reverseRecursiveHelper() {
        head = reverseRecursive(head);
    }

    public void reverseIterative() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Store next node
            current.next = prev;   // Reverse current node's pointer
            prev = current;        // Move prev and current forward
            current = next;
        }

        head = prev; // Update head to the new front
    }


    private Node reverseTailRecursive(Node current, Node prev) {
        if (current == null) return prev;

        Node next = current.next;
        current.next = prev;
        return reverseTailRecursive(next, current);
    }

    public void reverseTailRecursive() {
        head = reverseTailRecursive(head, null);
    }


    // Find middle node using Tortoise-Hare
    public Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is at the middle
    }

    // Floyd’s Cycle Detection
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    // Create a cycle manually for testing
    public void createCycle() {
        if (head == null) return;

        Node tail = head;
        Node second = head.next;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = second; // cycle back to second node
    }

    //Find the starting point of the cycle in a linked list.
    public void findCycleStart() {
        if (head == null) return;

        Node first = head;
        Node second = head.next;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) break;
        }
        System.out.println("Cycle starts from " + first.data);
    }

    public void removeCycleStart() {
        if (head == null) return;
        Node current = head;
        Node first = head;
        Node second = head.next;
        while (second != null && second.next != null) {
            first = first.next;
            current = current.next;
            second = second.next.next;
            if (first.next == second.next) break;
        }
        current.next = null;
    }

    public void removeFromPosition(int position) {
        Node current = head;
        while (current.next != null && position > 1) {
            current = current.next;
            position--;
        }
        System.out.println(current.data);
        current.next = current.next.next;
    }

    //Merge two sorted singly linked lists.
    public void merge(SinglyLinkedListOperations list, SinglyLinkedListOperations list2) {
        Node currentNode1 = list.head;
        Node currentNode2 = list2.head;
        SinglyLinkedListOperations mergedList = new SinglyLinkedListOperations();
        while (currentNode2 != null && currentNode1 != null) {
            if (currentNode1.data == currentNode2.data) {
                mergedList.add(currentNode1.data);
                mergedList.add(currentNode2.data);
                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            } else if (currentNode1.data < currentNode2.data) {
                mergedList.add(currentNode1.data);
                currentNode1 = currentNode1.next;
            } else if (currentNode2.data < currentNode1.data) {
                mergedList.add(currentNode2.data);
                currentNode2 = currentNode2.next;
            }
            if (currentNode2 != null && currentNode1 == null) {
                mergedList.add(currentNode2.data);
                currentNode2 = currentNode2.next;
            }
            if (currentNode1 != null && currentNode2 == null) {
                mergedList.add(currentNode1.data);
                currentNode1 = currentNode1.next;
            }
        }

        Node current = mergedList.head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println("null");

    }

    public boolean palindromeCheck(SinglyLinkedListOperations list) {
        Node current = list.head;

        Node slow = list.head, fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseListRecursive(slow);

        boolean palindrome = false;
        Node p1 = list.head, p2 = secondHalf;

        while (p2 != null) {
            if (p1.data != p2.data) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;

    }

    public Node reverseListRecursive(Node current) {
        Node prev = null;
        Node curr = current;
        while (curr != null) {
            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return curr;
    }

    public static void main(String[] args) {
        SinglyLinkedListOperations list = new SinglyLinkedListOperations();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(18);
        list.add(23);
        list.add(44);
        list.print();
        list.delete(2);
        list.delete(7);
        list.print();
        list.reverse();
        list.reverseRecursiveHelper();
        list.print();
        list.reverseIterative();
        list.print();
        list.reverseTailRecursive();
        list.print();
        System.out.println("Middle = " + list.findMiddle().data);
        System.out.println("Has cycle = " + list.hasCycle());
        System.out.println("Creating cycle");
        list.createCycle();
        System.out.println("Has cycle = " + list.hasCycle());
        list.findCycleStart();
        list.removeCycleStart();
        list.print();
        list.removeFromPosition(2);
        list.print();
        SinglyLinkedListOperations list1 = new SinglyLinkedListOperations();
        list1.add(1);
        list1.add(2);
        list1.add(13);
        list1.add(24);
        list1.add(35);
        list1.add(46);
        list1.add(57);
        list1.add(84);
        list1.add(88);
        list1.add(93);
        list1.add(98);
        list.merge(list1, list);
        System.out.println(list.palindromeCheck(list));
        System.out.println(list1.palindromeCheck(list1));
        SinglyLinkedListOperations palindromeList = new SinglyLinkedListOperations();
        palindromeList.add(1);
        palindromeList.add(2);
        palindromeList.add(3);
        palindromeList.add(3);
        palindromeList.add(2);
        palindromeList.add(1);
        System.out.println(palindromeList.palindromeCheck(palindromeList));

    }
}
