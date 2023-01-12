import java.util.ArrayList;

public class Card {
    String suit;
    int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    public static boolean beats(Card card) {
        Card kort = new Card("suit", 9);

        if (kort.suit == card.suit){
            return card.value < kort.value;
        }
        if (kort.suit.equals("suit")){
            return true;
        }
        else if (card.suit.equals("suit")){
            return false;
        }
        if (kort.suit.equals("hearts")){
            return true;
        }
        else if (card.suit.equals("hearts")){
            return false;
        }
        if (kort.suit.equals("diamonds")){
            return true;
        }
        else if (card.suit.equals("diamonds")){
            return false;
        }
        if (kort.suit.equals("spades")){
            return true;
        }
        else if (card.suit.equals("spades")){
            return false;
        }
        if (kort.suit.equals("clubs")){
            return true;
        }
        else if (card.suit.equals("clubs")){
            return false;
        }
        return true;
    }
}

