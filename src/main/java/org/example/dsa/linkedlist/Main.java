package org.example.dsa.linkedlist;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        System.out.println("Is LinkedList empty? " + myLinkedList.isEmpty());

//        myLinkedList.push("First");
//        myLinkedList.push("Second");
//        myLinkedList.push("Third");
//
//        System.out.println("LinkedList: " + myLinkedList);
//        System.out.println("Element at index 1: " + myLinkedList.get(1));
//        System.out.println("LinkedList size: " + myLinkedList.size());
//
//        System.out.println(myLinkedList.pop());
//        System.out.println("LinkedList after pop: " + myLinkedList);

        myLinkedList.offer("First");
        myLinkedList.offer("Second");
        myLinkedList.offer("Third");
        System.out.println("LinkedList: " + myLinkedList);
        System.out.println("Element at index 1: " + myLinkedList.get(1));
        System.out.println("LinkedList size: " + myLinkedList.size());

        System.out.println(myLinkedList.poll());
        System.out.println("LinkedList after poll: " + myLinkedList);

        System.out.println(myLinkedList.indexOf("Second"));
        myLinkedList.offerFirst("0");
        System.out.println("LinkedList after offerFirst: " + myLinkedList);
        myLinkedList.offerLast("new");
        System.out.println("LinkedList after offerLast: " + myLinkedList);


        myLinkedList.add(1, "first");
        System.out.println("LinkedList after add at index 1: " + myLinkedList);
    }
}
