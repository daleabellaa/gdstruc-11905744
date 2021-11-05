package com.gdstruc.quiz6;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        tree.insert(70);
        tree.insert(-17);

        tree.traverseInOrderDescending();
        //System.out.println(tree.get(25));
        System.out.println(tree.getMin());
        System.out.println(tree.getMax());

    }
}
