package com.gdstruc.quiz3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //region Players
        ArrayQueue lobby = new ArrayQueue(14);
        lobby.add(new Player(1, "The Hound", 100));
        lobby.add(new Player(2, "Brienne of Tarth", 100));
        lobby.add(new Player(3, "Arya Stark", 100));
        lobby.add(new Player(4, "Jaime Lannister", 100));
        lobby.add(new Player(5, "Tyrion Lannister", 100));
        lobby.add(new Player(6, "Daenarys Targaryen", 100));
        lobby.add(new Player(7, "The Mountain", 100));
        lobby.add(new Player(8, "Oberyn Martell", 100));
        lobby.add(new Player(9, "Khal Drogo", 100));
        lobby.add(new Player(10, "Jon Snow", 100));
        lobby.add(new Player(11, "Varys", 100));
        lobby.add(new Player(12, "Cersei Lannister", 100));
        lobby.add(new Player(13, "Robert Baratheon", 100));
        lobby.add(new Player(14, "Littlefinger", 100));

        //endregion
        ArrayQueue matchmaking = new ArrayQueue(14);

        Scanner scanner = new Scanner(System.in);
        int games = 1;
        int queuePlayers = 0;

        while (games <= 10) {
            int random = (int) Math.floor(Math.random() * (7 - 1 + 1) + 1);
            queuePlayers = queuePlayers + random;

            if (queuePlayers >= 5) {
                // add players to queue, remove from lobby
                for (int x = 1; x <= queuePlayers; x++) {
                    matchmaking.add(lobby.peek());
                    lobby.remove();
                }

                System.out.println("Game " + games);
                System.out.println("Number of players for matchmaking: " + queuePlayers);
                System.out.println("Before matchmaking: ");
                matchmaking.printQueue();
                System.out.print("\n");

                // pop 5 players from matchmaking
                for (int x = 1; x <= 5; x++) {
                    lobby.add(matchmaking.peek());
                    matchmaking.remove();
                }

                System.out.println("After matchmaking: ");
                matchmaking.printQueue();
                System.out.print("\n");
                System.out.println("-END TURN-");
                System.out.print("\n");

                // return all players from matchmaking to lobby
                for (int x = 1; x <= queuePlayers - 5; x++) {
                    lobby.add(matchmaking.peek());
                    matchmaking.remove();
                }

                games++;
                queuePlayers = 0;
            }

            else{
                System.out.println("Number of players for matchmaking: " + queuePlayers);
                System.out.println("INSUFFICIENT NUMBER OF PLAYERS");
                System.out.print("\n");
                System.out.println("-END TURN-");
                System.out.print("\n");
            }

            System.out.println ("Press ENTER to continue");
            System.out.print ("\n");
            scanner.nextLine();

        }
    }
}
