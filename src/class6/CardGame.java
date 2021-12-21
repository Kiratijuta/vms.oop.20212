package class6;

import java.util.LinkedList;

public class CardGame {

    public static void main(String[] args) {
        LinkedList<Card> player1Cards = new LinkedList<Card>();
        LinkedList<Card> player2Cards = new LinkedList<Card>();

        CardDeck game = new CardDeck();
        game.shuffle();
        game.shuffle();
        game.shuffle();
        game.shuffle();
        game.shuffle();
        game.shuffle();

        player1Cards.add(game.draw());
        player2Cards.add(game.draw());
        player1Cards.add(game.draw());
        player2Cards.add(game.draw());

        int player1CardScore = player1Cards.get(0).getRank() + player1Cards.get(1).getRank();
        int player2CardScore = player2Cards.get(0).getRank() + player2Cards.get(1).getRank();

        System.out.println("Player1 [" + player1Cards.get(0).getSuit() + "" + player1Cards.get(0).getRank() + ", " + player1Cards.get(1).getSuit() + "" + player1Cards.get(1).getRank() + "]");
        System.out.println("Player2 [" + player2Cards.get(0).getSuit() + "" + player2Cards.get(0).getRank() + ", " + player2Cards.get(1).getSuit() + "" + player2Cards.get(1).getRank() + "]");

        if (player1CardScore > player2CardScore) {
            System.out.println("The player 1 won!");
        } else if (player1CardScore == player2CardScore) {
            System.out.println("They're draw");
        } else {
            System.out.println("The player 2 won!");
        }
    }

}
