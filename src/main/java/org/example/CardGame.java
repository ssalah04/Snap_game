package org.example;
import java.util.ArrayList;
public class CardGame {
    public ArrayList<Card> deckOfCards;
    private String name;

    public CardGame(ArrayList<Card> deckOfCards) {

        this.deckOfCards = deckOfCards;
    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }
    public Card dealCard(){
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.removeFirst(); // returns and removes card.
        }

        return null;
    }
    public ArrayList<Card> sortDeckInNumberOrder(){
       deckOfCards.sort((a, b) -> a.getValue() - b.getValue());
        return deckOfCards;
    }
}
//dealCard Takes the card from the top of the deck and returns it.
//ArrayList<Card> sortDeckInNumberOrder()
//Sorts the deck in number order (e.g. 2222333344445555 etc.)
// and stores the new shuffled de