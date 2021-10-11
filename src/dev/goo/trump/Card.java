package dev.goo.trump;

public class Card {
    public String suit;
    public String value;
    public int intValue;

    public Card(String suit, String value, int intValue) {
        this.suit = suit;
        this.value = value;
        this.intValue = intValue;
    }

    public String getCardString() {
        return this.suit + this.value + "(" + this.intValue + ")";
    }
}
