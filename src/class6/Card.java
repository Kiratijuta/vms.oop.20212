package class6;

public class Card {

    private int rank;
    private String suit;

    Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
