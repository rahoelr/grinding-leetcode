package org.example.dsa.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static void main(String[] args) {

        Queue<String> myPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Is priority queue empty ? " + myPriorityQueue.isEmpty());

        myPriorityQueue.offer("Banana");
        myPriorityQueue.offer("Apple");
        myPriorityQueue.offer("Cherry");
        System.out.println("Priority Queue: " + myPriorityQueue);
        System.out.println("Peek element: " + myPriorityQueue.peek());


        while (!myPriorityQueue.isEmpty()){
            for (int i = 0; i < myPriorityQueue.size() + 1; i++) {
                System.out.println("Poll element: " + myPriorityQueue.poll());
            }
        }
    }
}
