package com.vishnu;

public class StackLinkedList {
    private class Node{
        Node next;
        Node last;
        int value;
        private Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    public void push(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.last = tail;
        tail = node;
    }
    public void peek(){
        System.out.println(tail.value);
    }
    public void pop(){
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        var m = tail.last;
        tail.last = null;
        tail = m;
    }
    public void display(){
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        var current = tail;
        while (current != head){
            System.out.println(current.value);
            current = current.last;
        }
        System.out.println(head.value);
        System.out.println();
    }
}
