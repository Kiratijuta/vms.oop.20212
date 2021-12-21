package class6;

import java.util.*;

public class CardDeck {

    private LinkedList<Card> cards;

    CardDeck() {
        cards = new LinkedList<Card>();

        // Diamonds
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Diamond"));
        }
        // Clubs
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Club"));
        }
        // Hearts
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Heart"));
        }
        // Spades
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Spade"));
        }
    }

    public Card draw() {
        Card card = cards.removeFirst();
        return card;
    }

    public Card peek() {
        return cards.peek();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}
