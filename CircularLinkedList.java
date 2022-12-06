package com.vishnu;

public class CircularLinkedList {
    private class Node{
        int value;
        Node next;
        private Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;

    public void add(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;
    }

    public void display(){
        Node current = head;
        while (true){
            System.out.println(current.value);
            current = current.next;
            if (current == head) {
                System.out.println(current.value);
                return;
            }
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);
        cll.display();
    }

}
