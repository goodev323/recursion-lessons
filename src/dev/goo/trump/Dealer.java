package dev.goo.trump;

import java.util.ArrayList;
import java.util.Arrays;

public class Dealer {
    public static ArrayList<ArrayList<Card>> startGame(Table table) {
        Deck deck = new Deck(table);
        deck.shuffleDeck();
        ArrayList<ArrayList<Card>> playerCards = new ArrayList<>();
        for (int i = 0; i < table.amountOfPlayers; i++) {
            ArrayList<Card> playerHand =
                    new ArrayList<>(Dealer.initialCards(table.gameMode));
            for (int j = 0; j < Dealer.initialCards(table.gameMode); j++) {
                playerHand.add(deck.draw());
            }
            playerCards.add(playerHand);
        }
        return playerCards;
    }

    public static int initialCards(String gameMode) {
        switch (gameMode) {
            case "poker":
                return 5;
            case "21":
                return 2;
            default:
                return 0;
        }
    }

    public static int score21Individual(ArrayList<Card> cards) {
        int value = cards.stream().mapToInt(i->i.intValue).sum();
        return value > 21 ? 0 : value;
    }

    public static String winnerOf21(ArrayList<ArrayList<Card>> playerCards) {
        int[] points = new int[playerCards.size()];
        int[] cache = new int[22];

        for(int i = 0; i < playerCards.size(); i++) {
            int point = Dealer.score21Individual(playerCards.get(i));
            points[i] = point;
            if(cache[point] >= 1) cache[point] += 1;
            else cache[point] = 1;
        }
        System.out.println(Arrays.toString(points));
        System.out.println(Arrays.toString(cache));

        int winnerIndex = HelperFunctions.maxInArrayIndex(points);
        if(cache[points[winnerIndex]] > 1) return "It is a draw";
        else if(cache[points[winnerIndex]] >= 0) return "player " + (winnerIndex + 1) + " is the winner";
        else return "No winners...";
    }

    public static String checkWinner(ArrayList<ArrayList<Card>> playerCards, Table table) {
        if(table.gameMode == "21") return Dealer.winnerOf21(playerCards);
        else return "no game";
    }

    public static void printTableInformation(ArrayList<ArrayList<Card>> playerCards, Table table) {
        for (int i = 0; i < playerCards.size(); i++) {
            for (Card card : playerCards.get(i)) {
                System.out.println(card.getCardString());
            }
        }
    }
}
