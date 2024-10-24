
class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter methods
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Setter methods
    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String cardInfo() {
        return rank + " of " + suit;
    }
}

public class EncapsulationCardExample {
    public static void main(String[] args) {
        Card card1 = new Card("Ace", "Spades");
        Card card2 = new Card("7", "Hearts");

        System.out.println("Card 1: " + card1.cardInfo());
        System.out.println("Card 2: " + card2.cardInfo());

        card1.setRank("King");
        card2.setSuit("Diamonds");

        System.out.println("Updated Card 1: " + card1.cardInfo());
        System.out.println("Updated Card 2: " + card2.cardInfo());
    }
}
