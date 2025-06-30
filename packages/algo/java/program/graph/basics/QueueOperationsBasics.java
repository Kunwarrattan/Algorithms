package packages.algo.java.program.graph.basics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class QueueOperationsBasics {

    public static void printQueue(Deque<Integer> queue) {
        int i = 0;
        while (!queue.isEmpty()) {
            System.out.println(" " + i + " " + queue.poll());
            i++;
        }
    }

    public static void printQueueRecursive(Deque<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        System.out.println(queue.poll());
        printQueueRecursive(queue);
    }

    public static void addRandomElementsToQueue(Deque<Integer> queue) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int element = (int) (Math.random() * Math.random() * 100);
            if (set.contains(element)) {
                i--;
                continue;
            }
            set.add(element);
            queue.add(element);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        addRandomElementsToQueue(queue);
        printQueue(queue);
    }
}
