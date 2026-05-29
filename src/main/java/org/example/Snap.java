package org.example;
import java.util.Scanner;
public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }
    public void start() {
        Card lastCard = null;
        while (true) {
            Card activeCard = dealCard();
            System.out.println(activeCard);
            if (lastCard != null && activeCard.getSymbol().equals(lastCard.getSymbol())) {
                System.out.println("SNAP! Congratulations, You Win!");
                break;
            }
            lastCard = activeCard;
        }
    }
}

