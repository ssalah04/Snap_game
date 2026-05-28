package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        CardGame game = new CardGame("Test");

        System.out.println(game.getDeck().size());
        System.out.println(game.getDeck());
        System.out.println(game.dealCard());
        System.out.println(game.getDeck().size());

    }
}
