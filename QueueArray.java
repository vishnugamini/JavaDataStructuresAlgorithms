package com.vishnu;

import java.util.Arrays;

public class QueueArray {
    private int[] arr = new int[5];
    private int size = arr.length;
    private int front = 0;
    private int rear = -1;

    public void enQueue(int value) {
        if (rear < size - 1) {
            rear++;
            arr[rear] = value;
        } else
            System.out.println("queue is full");
    }

    public void deQueue() {
        if (rear == front - 1) {
            System.out.println("queue is empty");
            front = 0;
            rear = -1;
        } else if (rear > 0) {
            arr[front] = 0;
            front++;
        } else if (rear == 0) {
            arr[front] = 0;
        } else if (rear == -1)
            System.out.println("no elements in the queue");
    }

    public void display(){
        if (rear == front -1){
            System.out.println("queue is empty");
            return;
        }
        int current = front;
        while (current <= rear){
            System.out.println(arr[current]);
            current++;
        }

    }
}
