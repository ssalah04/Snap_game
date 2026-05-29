package org.example;

public class Card {
    public String suit;
    public String symbol;
    public int value;

    public Card(String suit, String symbol,int value) {
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

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return symbol + suit;
    }
}
