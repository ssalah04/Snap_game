package org.example;
import java.util.Scanner;
public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);

        shuffleDeck();

        Card lastCard = null;

        while (true) {
            System.out.println("Press enter to deal a card");

            scanner.nextLine();

            Card activeCard = dealCard();

            System.out.println("Card dealt: " + activeCard);

            //System.out.println(activeCard);
            if (lastCard != null && activeCard.getSymbol().equals(lastCard.getSymbol())) {
                System.out.println("SNAP! Congratulations, You Win!");
                break;
            }
            lastCard = activeCard;
        }
    }
}

