package com.gdstruc.quiz2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player asuna = (new Player(1, "Asuna", 100 ));
        Player lethalBacon = (new Player(2, "LethalBacon", 205 ));
        Player hpDeskjet = (new Player(3, "HPDeskjet", 34 ));

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.removeFirstElement();
        System.out.print("\n");

        playerLinkedList.printList();
        System.out.print("\n");

        playerLinkedList.contains(hpDeskjet);
        System.out.print("\n");

        playerLinkedList.indexOf(lethalBacon);

    }
}
