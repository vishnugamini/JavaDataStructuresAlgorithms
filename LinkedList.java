package com.vishnu;

import java.util.Arrays;
import java.util.NoSuchElementException;
public class LinkedList {
    private class Node {
        private Node next;
        private int value;
        private Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size = 0;
    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        addSize();
    }

    public void addFirst(int item){
        Node node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }
        addSize();
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        var current = first;
        while (current != null){
            if (current.value == item)
                return true;
            else {
                current = current.next;
            }
        }
        return false;
    }

    public void removeFirst(){
        // 10 --> 20 --> 30
        // here we are storing second's address and then removing first's address and updating second as first
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        subtractSize();
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
            subtractSize();
            return;
        }
        var previous = getPrevious(last);
        // 10 --> 20 --> 30
        last = previous;
        last.next = null;
        subtractSize();
    }

    private void addSize(){
        size++;
    }
    private void subtractSize(){
        size--;
    }
    public int getSize(){
        return size;
    }

    public int [] toArray(){
        int [] arr = new int[size];
        int index = 0;
        var current = first;
        while (current != null){
            arr[index] = current.value;
            current = current.next;
            index = index + 1;
        }
        return arr;
    }

    public void reverseList(){
        // 10 -> 20 -> 30 -> 40
        // 10 <- 20 <- 30 <- 40
        if (isEmpty())
            return;
        var previous = first;
        var current = first.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }


    private boolean isEmpty(){
        return first == null;
    }
}
