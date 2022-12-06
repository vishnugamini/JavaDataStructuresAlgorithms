package com.vishnu;

public class DequeLinkedList {
    private class Node{
        int value;
        Node next;
        private Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;

    public void addFirst(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void addLast(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void deleteFirst(){
        if (head==null)
            return;
        head = head.next;
        head.next = null;
    }
    public void deleteLast(){
        if (head == null)
            return;
        Node current = head;
        while (true){
            if (head == tail){
                head = tail = null;
                return;
            }
            else if (current.next == tail) {
                current.next = null;
                tail = current;
                break;
            }
            current = current.next;
        }

    }
    public void display(){
        if (head == null)
            return;
        var current = head;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
