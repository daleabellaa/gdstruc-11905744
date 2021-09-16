package com.gdstruc.quiz2;

public class PlayerLinkedList
{
    private PlayerNode head;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeFirstElement() {
        PlayerNode firstPlayer = head;
        System.out.print("Removed first element: ");
        System.out.println(firstPlayer.getPlayer());
        firstPlayer = firstPlayer.getNextPlayer();
        head = firstPlayer;
    }

    public void contains(Player player)
    {
        boolean x = false;
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer() == player) {
                x = true;
                break;
            }
            current = current.getNextPlayer();
        }
        System.out.println(x);
    }

    public void indexOf(Player player)
    {
        boolean x = false;
        int index = -1;
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer() == player) {
                x = true;
                break;
            }
            current = current.getNextPlayer();
        }

        current = head;

        if (x)
        {
            while (current.getPlayer() != null) {
                index++;
                if (current.getPlayer() == player) {
                    break;
                }
                current = current.getNextPlayer();
            }
        }

        System.out.println(index);
    }

    public void printList()
    {
        int size = 0;
        PlayerNode current = head;
        System.out.println("Linked List: ");
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.println(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
            size++;
        }
        System.out.println("null");
        System.out.print("Elements in Linked List: ");
        System.out.println(size);
    }
}

