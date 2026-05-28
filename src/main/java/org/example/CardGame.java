package org.example;
import java.util.ArrayList;
public class CardGame {
    public ArrayList<Card> deck;

    public CardGame(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    public Card dealCard(){
        if (!deck.isEmpty()) {
            return deck.removeFirst(); // returns and removes card.
        }

        return null;
    }
    public Card sortDeckInNumberOrder(){
       return deck.sort((a, b)int.compare(a - b));
    }
}
//dealCard Takes the card from the top of the deck and returns it.
//ArrayList<Card> sortDeckInNumberOrder()
//Sorts the deck in number order (e.g. 2222333344445555 etc)
// and stores the new shuffled deck back into the deckOfCards attribute.