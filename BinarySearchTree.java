package com.vishnu;
public class BinarySearchTree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value) {
            this.value = value;
        }
    }
    public Node root;
    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }

        }
    }

    public void find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;

            else if (value > current.value)
                current = current.rightChild;

            else {
                System.out.println("element found");
                return;
            }
        }
        System.out.println("element not found");

    }

    public Node deleteNode(Node root, int k)
    {
        if (root == null)
            return root;

        if (root.value > k)
        {
            root.leftChild = deleteNode(root.leftChild, k);
            return root;
        }
        else if (root.value < k)
        {
            root.rightChild = deleteNode(root.rightChild, k);
            return root;
        }

        if (root.leftChild == null)
        {
            Node temp = root.rightChild;
            return temp;
        }
        else if (root.rightChild == null)
        {
            Node temp = root.leftChild;
            return temp;
        }
        else
        {
            Node New_parent = root;
            Node New_child = root.rightChild;
            while (New_child.leftChild != null)
            {
                New_parent = New_child;
                New_child = New_child.leftChild;
            }
            if (New_parent != root)
                New_parent.leftChild = New_child.rightChild;
            else
                New_parent.rightChild = New_child.rightChild;
            root.value = New_child.value;
            return root;
        }
    }

    public void preOrder(Node root){
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void inOrder(Node root){
        if (root == null)
            return;
        inOrder(root.leftChild);
        System.out.print(root.value + " ");
        inOrder(root.rightChild);
    }


    public void postOrder(Node root){
        if (root == null)
            return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.value + " ");
    }

    public int height(Node root){
        if (root == null)
            return -1;
        if (root.leftChild == null && root.rightChild == null)
            return 0;
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));


    }
    // time complexity O(n)
    public int minValue(Node root){
        if (root.rightChild == null && root.leftChild == null)
            return root.value;
        var left = minValue(root.leftChild);
        var right = minValue(root.rightChild);
        return Math.min(Math.min(left,right),root.value);
    }
    // time complexity O(n)
    public int maxValue(Node root){
        if (root.leftChild == null && root.rightChild == null)
            return root.value;
        int left = maxValue(root.leftChild);
        int right = maxValue(root.rightChild);
        return Math.max(Math.max(left,right),root.value);
    }

    public boolean equals(BinarySearchTree tree){
        return equals(root,tree.root);
    }
    private boolean equals(Node node1, Node node2){
        if (node1 == null && node2 == null)
            return true;
        if (node1 != null && node2 != null) {
            return node1.value == node2.value &&
                    equals(node1.leftChild, node2.leftChild) &&
                    equals(node1.rightChild, node2.rightChild);
        }
        return false;
    }
}
