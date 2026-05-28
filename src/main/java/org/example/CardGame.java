package org.example;
import java.util.ArrayList;

public class CardGame {
    public ArrayList<Card> deckOfCards;
    public String name;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = new ArrayList<>();
        populateDeck();
    }
    public void populateDeck(){
        String[] suits = {"♥", "♣", "♦", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                Card card = new Card(suit, symbols[i], values[i]);
                deckOfCards.add(card);
            }
        }
    }
    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }
    public Card dealCard(){
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.remove(0); // returns and removes card.
        }

        return null;
    }
    public ArrayList<Card> sortDeckInNumberOrder(){
       deckOfCards.sort((a, b) -> a.getValue() - b.getValue());
        return deckOfCards;
    }
    public ArrayList<Card> sortDeckIntoSuits() {

        deckOfCards.sort((a, b) -> {

            int suitCompare = a.getSuit().compareTo(b.getSuit());

            if (suitCompare == 0) {
                return a.getValue() - b.getValue();
            }

            return suitCompare;
        });

        return deckOfCards;
    }
    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}
//dealCard Takes the card from the top of the deck and returns it.
//ArrayList<Card> sortDeckInNumberOrder()
//Sorts the deck in number order (e.g. 2222333344445555 etc.)
// and stores the new shuffled de