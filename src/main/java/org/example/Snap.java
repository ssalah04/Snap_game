package org.example;
import java.util.Scanner;
public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player 1 name:");
        String playerOneName = scanner.nextLine();
        System.out.println("Enter Player 2 name:");
        String playerTwoName = scanner.nextLine();
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);

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
