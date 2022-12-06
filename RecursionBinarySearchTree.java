package com.vishnu;

public class RecursionBinarySearchTree {
    private class Node{
        int value;
        private Node rightChild;
        private Node leftChild;
        private Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void add(int value){
        Node node = new Node(value);
        add(node,root);
    }
    private void add(Node node, Node ref){
        if (root == null) {
            root = node;
            return;
        }
        if (node.value < ref.value){
            if (ref.leftChild == null) {
                ref.leftChild = node;
            }
            else
                add(node,ref.leftChild);
        }
        else if (node.value > ref.value){
            if (ref.rightChild == null)
                ref.rightChild = node;
            else
                add(node,ref.rightChild);

        }
    }

    public void display(){
        display(root);
    }
    private void display(Node root){
        if (root == null)
            return;
        System.out.println(root.value);
        display(root.leftChild);
        display(root.rightChild);
    }


    public static void main(String[] args) {
        RecursionBinarySearchTree rbs = new RecursionBinarySearchTree();
        rbs.add(5);
        rbs.add(8);
        rbs.add(4);
        rbs.add(6);
        rbs.display();
    }

}
