package dev.goo.trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Deck {
    public ArrayList<Card> deck;
    private static final String[] suites = new String[]{"♣", "♦", "♥", "♠"};
    private static final String[] values = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static final HashMap<String, Integer> blackJack = new HashMap<>() {
        {
            put("A", 1);
            put("J", 10);
            put("Q", 10);
            put("K", 10);
        }
    };

    public Deck(Table table) {
        this.deck = Deck.generateDeck(table);
    }

    public static ArrayList<Card> generateDeck(Table table) {
        ArrayList<Card> newDeck = new ArrayList<>();
        for (String suite : suites) {
            for (int i = 0; i < values.length; i++) {
                if (table.gameMode == "21") {
                    int value = blackJack.containsKey(values[i]) ? blackJack.get(values[i]) : i + 1;
                    newDeck.add(new Card(suite, values[i], value));
                } else {
                    newDeck.add(new Card(suite, values[i], i + 1));
                }

            }
        }
        return newDeck;
    }

    public void shuffleDeck() {
        for (int i = this.deck.size() - 1; i >= 0; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            Collections.swap(this.deck, i, j);
        }
    }

    public Card draw() {
        return this.deck.remove(this.deck.size() - 1);
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.getCardString());
        }
    }
}
