package org.example.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        System.out.println("Is queue empty ? " + myQueue.isEmpty());

        myQueue.offer("First");
        myQueue.offer("Second");
        myQueue.offer("Third");

        System.out.println(myQueue);

        myQueue.poll();
        System.out.println("After poll: " + myQueue);

        System.out.println(myQueue.peek());


    }
}
