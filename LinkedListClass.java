package com.vishnu;

public class LinkedListClass{
    private class Node{
        private Node(int value){
            this.value = value;
        }
        private Node next;
        private int value;
    }
    private Node first;
    private Node last;
    public void insert(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }
    public void display(){
        Node current = first;
        if (first == null){
            System.out.println("no items in the list");
        }
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
    public void display(Node root){
        Node current = root;
        if (first == null){
            System.out.println("no items in the list");
        }
        while (current != null) {
            System.out.println(current.value);
            root = root.next;
        }
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }
    }
    public void insertAt(int position, int value){
        Node node = new Node(value);
        int index = 0;
        var current = first;
        if (first == null){
            first = last = node;
            return;
        }
        while (index < position - 1){
            current = current.next;
            index++;
        }
        var temp = current.next;
        current.next = node;
        node.next = temp;
    }

    public void deleteAt(int position){
        var current = first;
        int index = 0;
        while (index < position - 1){
            current = current.next;
            index++;
        }
//        System.out.println(current.value);
        var temp = current.next.next;
        current.next.next = null;
        current.next = temp;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
            return;
        }
        last.next = node;
        last = node;
    }
    public void alternateAddLinkedList(LinkedListClass b){
        var current1 = first;
        var current2 = b.first;
        if (current1 != null && current2 == null){
            display();
        }
        else if(current1 == null && current2 != null){
            display(current2);
        }

        while (current1 != null && current2 != null){
            var temp1 = current1.next;
            var temp2 = current2.next;

            current1.next = current2;
            current2.next = temp1;

            current1 = temp1;
            current2 = temp2;
        }
        var current = first;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListClass li = new LinkedListClass();
        li.insert(1);
        li.insert(2);
        li.insert(3);
        li.insert(4);
        LinkedListClass li1 = new LinkedListClass();
        li1.insert(1);
        li1.insert(2);
        li1.insert(3);
        li1.insert(4);
        li.alternateAddLinkedList(li1);
    }
}
