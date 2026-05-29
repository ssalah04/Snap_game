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
    public boolean attemptSnap(Scanner scanner) {
       try {
        long startTime = System.currentTimeMillis();

        String answer = scanner.nextLine();

        long reactionTime = System.currentTimeMillis() - startTime;

        return answer.equalsIgnoreCase("snap") &&
                reactionTime <= 2000;
       } catch (Exception e) {
           System.out.println("Something went wrong.");
           return false;
       }
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
                    System.out.println("SNAP! Type 'snap' within 2 seconds!");
                    if (attemptSnap(scanner)) {
                        System.out.println("SNAP! Congratulations, " + activePlayer.getName() + " wins!");
                    }
                    else {
                        System.out.println("Sorry, "+ activePlayer.getName() + " was too slow!");
                    }
                    break;
                }
                lastCard = activeCard;
                turn++;
            }
        }
    }
