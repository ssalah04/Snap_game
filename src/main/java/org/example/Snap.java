package org.example;
import java.util.Scanner;
public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }
    public Player createPlayer( Scanner scanner,String message) {
        System.out.println(message);
        String name = scanner.nextLine();
        return new Player(name);
    }
    public void start() {

        Scanner scanner = new Scanner(System.in);

        Player playerOne = createPlayer(scanner, "Enter Player 1 name:");
        Player playerTwo = createPlayer(scanner, "Enter Player 2 name:");

        shuffleDeck();


        Card lastCard = null;
        int turn = 0;

            while (true) {
                Player activePlayer;
                if (turn % 2 == 0) {
                    activePlayer = playerOne;
                } else {
                    activePlayer = playerTwo;
                }

                System.out.println(activePlayer.getName() + ", press enter to deal a card");
                scanner.nextLine();

                Card activeCard = dealCard();

                System.out.println("Card dealt: " + activeCard);

                if (lastCard != null && activeCard.getSymbol().equals(lastCard.getSymbol())) {
                    System.out.println("SNAP! Congratulations, " + activePlayer.getName() + " wins!");
                    break;
                }
                lastCard = activeCard;
                turn++;
            }
        }
    }
