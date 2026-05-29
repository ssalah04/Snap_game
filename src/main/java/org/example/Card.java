package org.example;

public class Card {
    public Suit suit;;
    public String symbol;
    public int value;

    public Card(Suit suit, String symbol,int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return symbol + suit;
    }
}
