package com.vishnu;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree{
    private class Node{
        int value;
        Node leftChild;
        Node rightChild;
        private Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void insert(int value){
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Node temp = q.peek();
            q.remove();
            if (temp.leftChild == null){
                temp.leftChild = node;
                break;
            }
            else
                q.add(temp.leftChild);

            if (temp.rightChild == null){
                temp.rightChild = node;
                break;
            }
            else q.add(temp.rightChild);
        }
    }
    public void display(Node root){
        if (root == null)
            return;
        System.out.println(root.value);
        display(root.leftChild);
        display(root.rightChild);


    }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.display(bt.root);
    }
}