package com.vishnu;

public class QueueLinkedList {
    private class Node{
        int value;
        Node next;
        private Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node last;

    public void enQueue(int value){
        Node node = new Node(value);
        if (head == null){
            head = last = node;
            return;
        }
        last.next = node;
        last = node;
    }

    public void deQueue(){
        if (head == null){
            System.out.println("no elements in the queue");
            return;
        }
        var m = head.next;
        head.next = null;
        head = m;

    }
    public void display(){
        var current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
