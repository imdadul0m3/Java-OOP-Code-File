

class Card {
    private String suit;
    private int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return "[" + suit + ", " + rank + "]";
    }
}



public class Main {
    public static void main(String[] args) {
        Card card = new Card("Hearts", 1);

        System.out.println(card);

        try {
            card.setSuit("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            card.setRank(100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
