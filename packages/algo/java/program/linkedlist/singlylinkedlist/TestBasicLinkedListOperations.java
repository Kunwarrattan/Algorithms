package packages.algo.java.program.linkedlist.singlylinkedlist;

import packages.algo.java.program.linkedlist.util.LinkedListBasicOperations;

public class TestBasicLinkedListOperations {
    public static void main(String[] args) {
        LinkedListBasicOperations<Integer> listBasicOperations = new LinkedListBasicOperations<>();
        listBasicOperations.dummyIntegerData(listBasicOperations);
        listBasicOperations.traverse();
        System.out.println("");
        listBasicOperations.deleteFromBeginning();
        listBasicOperations.traverse();
        System.out.println("");
        listBasicOperations.deleteFromEnd();
        listBasicOperations.traverse();
        System.out.println("");
        listBasicOperations.addToBeginning(10);
        listBasicOperations.addToEnd(20);
        listBasicOperations.traverse();
        System.out.println("");
        listBasicOperations.dummyIntegerData(listBasicOperations);
        listBasicOperations.traverse();
    }
}
