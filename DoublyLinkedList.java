package com.vishnu;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private class Node{
        int value;
        Node next;
        Node previous;
        private Node(int value){
            this.value = value;
        }
    }
    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.previous = tail;
        tail = node;
    }
    public void display(){
        var current = head;
        while (current != null){
            System.out.print(current.value);
            current = current.next;
        }
    }
}
