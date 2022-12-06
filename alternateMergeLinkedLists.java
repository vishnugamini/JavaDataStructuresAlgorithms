package com.vishnu;

public class alternateMergeLinkedLists {
    private class Node{
        Node next;
        int value;
        public Node(int value){
            this.value = value;
        }
    }
    public Node first;
    public Node last;

    public void insert(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
            return;
        }
        last.next = node;
        last = node;
    }
    public void merge(alternateMergeLinkedLists a, alternateMergeLinkedLists b){
        Node roota = a.first;
        Node rootb = b.first;
        while (roota != null && rootb != null) {
            Node tempa = roota.next;
            Node tempb = rootb.next;

            roota.next = rootb;
            rootb.next = tempa;

            roota = tempa;
            rootb = tempb;
        }
        Node current = a.first;

        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("null");

    }
}
