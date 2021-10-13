package com.gdstruc.quiz4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);


        System.out.println("Initial hashtable: ");

        hashtable.printHashtable();
        System.out.print("\n");

        System.out.println("Enter key: ");
        Scanner scanner = new Scanner(System.in);
        String keyInput = scanner.nextLine();
        System.out.print("\n");
        System.out.println("You have entered: " + keyInput);
        System.out.print("\n");


        hashtable.remove(keyInput);
        System.out.print("\n");

        System.out.println("After removing key:");
        hashtable.printHashtable();
        System.out.print("\n");




    }
}
