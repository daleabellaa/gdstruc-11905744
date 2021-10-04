package com.gdstruc.midterm;

public class Main {

    static void playRound(CardStack hand, CardStack deck, CardStack pile) {
        while(deck.getCount() > 0) {

            int randomCommand = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            int randomValue = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);

            if (randomCommand == 1 ) {
                if (randomValue > deck.getCount()){
                    for (int x = 0; x < deck.getCount(); x++) {
                        hand.push(deck.peek());
                        deck.pop();
                    }
                }
                else {
                    System.out.println("DRAW CARD/S! ");
                    for (int x = 0; x < randomValue; x++) {
                        hand.push(deck.peek());
                        deck.pop();
                    }
                    System.out.println("Number of drawn cards: " + randomValue);
                }
            }

            if (randomCommand == 2 ) {
                if (hand.getCount() == 0) {
                    System.out.println("NO CARD/S TO DISCARD! ");
                }
                else if (randomValue > hand.getCount())
                {
                    System.out.println("DISCARD CARD/S! ");
                    for (int x = 0; x < hand.getCount(); x++) {
                        pile.push(hand.peek());
                        hand.pop();
                    }
                    System.out.println("Number of discarded cards: " + randomValue);
                }
                else {
                    System.out.println("DISCARD CARD/S! ");
                    for (int x = 0; x < randomValue; x++) {
                        pile.push(hand.peek());
                        hand.pop();
                    }
                    System.out.println("Number of discarded cards: " + randomValue);
                }
            }

            if (randomCommand == 3 ) {
                if (pile.getCount() == 0) {
                    System.out.println("NO CARD/S TO DRAW FROM DISCARD PILE! ");
                }
                else if (randomValue > pile.getCount()) {
                    for (int x = 0; x < pile.getCount(); x++) {
                        hand.push(pile.peek());
                        pile.pop();
                        System.out.println("Number of drawn cards from discarded pile: " + randomValue);
                    }
                }
                else {
                    System.out.println("DRAW CARD/S FROM DISCARD PILE! ");
                    for (int x = 0; x < randomValue; x++) {
                        hand.push(pile.peek());
                        pile.pop();
                    }
                    System.out.println("Number of drawn cards from discarded pile: " + randomValue);
                }
            }

            System.out.println("END GAME STATS: ");
            System.out.println("Current Hand: ");
            hand.printStack();

            System.out.println("Cards in Deck: " + deck.getCount());

            System.out.println("Cards in Discarded Pile: " + pile.getCount());
            System.out.print("\n");
        }
        System.out.println("GAME OVER! ");
        System.out.println("END ROUND STATS: ");
        System.out.println("Current Hand:" + " (" + hand.getCount() + " cards)");
        hand.printStack();

        System.out.println("Cards in Deck: " + deck.getCount());

        System.out.println("Cards in Discarded Pile: " + pile.getCount());
    }

    public static void main(String[] args) {

        //region Card Deck

        CardStack deck = new CardStack(30);

        deck.push(new Card("Mew"));
        deck.push(new Card("Garchomp"));
        deck.push(new Card("Charizard"));
        deck.push(new Card("Blastoise"));
        deck.push(new Card("Venosaur"));
        deck.push(new Card("Metagross"));
        deck.push(new Card("Zoroark"));
        deck.push(new Card("Tyranitar"));
        deck.push(new Card("Eevee"));
        deck.push(new Card("Snorlax"));
        deck.push(new Card("Volcarona"));
        deck.push(new Card("Mewtwo"));
        deck.push(new Card("Milotic"));
        deck.push(new Card("Kyurem"));
        deck.push(new Card("Haxorus"));
        deck.push(new Card("Arceus"));
        deck.push(new Card("Mienshao"));
        deck.push(new Card("Espeon"));
        deck.push(new Card("Golurk"));
        deck.push(new Card("Kingdra"));
        deck.push(new Card("Ho-Oh"));
        deck.push(new Card("Serperior"));
        deck.push(new Card("Vaporeon"));
        deck.push(new Card("Dragonite"));
        deck.push(new Card("Shedinja"));
        deck.push(new Card("Pikachu"));
        deck.push(new Card("Dialga"));
        deck.push(new Card("Gyarados"));
        deck.push(new Card("Lucario"));
        deck.push(new Card("Lapras"));

        //endregion

        //region Discard Pile
        CardStack pile = new CardStack(30);
        //endregion

        //region Player Hand
        CardStack hand = new CardStack(30);
        //endregion

        playRound(hand, deck, pile);
    }
}
