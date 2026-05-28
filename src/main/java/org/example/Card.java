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
    public String dealCard(){
        return symbol + suit + " (Value: " + value + ")";
    }
}
//Has a String suit. Use the Unicode characters of heart, club, diamond and spade.
//Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
//Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)
//Has a toString method that describes the class


