package com.vishnu;

public class DoubleLinkedList {
    private static class Node{
        int value;
        Node next;
        Node previous;
        private Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
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

    public void delete(int value){
        Node current = head;
        if (head == null){
            System.out.println("no elements in the linked list");
            return;
        }
        else if (value == head.value) {
            head = head.next;
            head.previous = null;
            return;

        }
        while (true){
            if (current.next == null){
                System.out.println("element not found");
                return;
            }
            else if (current.next.value == value){
                break;
            }
            current = current.next;
        }
        if (current.next.next == null){
            current.next = null;
            tail = current;
            return;
        }
        var temp = current.next.next;
        current.next.next.previous = current;
        current.next.next = null;
        current.next = temp;
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
