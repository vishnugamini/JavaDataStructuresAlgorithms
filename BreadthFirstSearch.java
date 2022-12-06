package com.vishnu;

public class BreadthFirstSearch {
    public class Node{
        int value = 0;
        Node left = null;
        Node right = null;
        private Node(int value){
            this.value = value;
        }
    }
    public Node root = null;

    public void insert(int value){
        var node = new Node(value);
        if (root == null){
            root = node;
            return;
        }
        var current = root;
        while (true){
            if (value < current.value) {
                if (current.left == null){
                    current.left = node;
                    break;
                }
                current = current.left;
            }
            else{
                if (current.right == null){
                    current.right = node;
                    break;
                }
                current = current.right;
            }

        }
    }

    public void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
        }

    private int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    private void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.value + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

}