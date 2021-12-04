package com.gdsturc.module7;

public class Tree {

    private Node root;

    public void insert(int value){
        if (root == null){
            root = new Node(value);

        }
        else{
            root.insert(value);
        }
    }


    public void reverseTraverseInOrder() {
        if(root != null) {

            root.reverseTraverseInOrder();

        }
    }
    public void traverseInOrder() {
        if (root != null) {

            root.traverseInOrder();

        }
    }


    public void getMax() {

        System.out.println("Max: " + root.getMax(root));

    }

    public void getMin() {

        System.out.println("Min: " + root.getMin(root));

    }


    public Node get(int value){
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }
}
