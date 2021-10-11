package dev.goo.trump;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairOfCard {
    public static String winnerPairOfCards(String[] player1,String[] player2){
        ArrayList<Integer> player1CardRanks = calcCardRanks(player1);
        ArrayList<Integer> player2CardRanks = calcCardRanks(player2);

        for(int i = 0; i < player1CardRanks.size(); i++) {
            int player1CardRank = player1CardRanks.get(i);
            int player2CardRank = player2CardRanks.get(i);

            if(player1CardRank > player2CardRank) return "player1";
            else if(player1CardRank < player2CardRank) return "player2";
        }
        return "draw";
    }

    private static ArrayList<Integer> calcCardRanks(String[] cards) {
        int[] cache = new int[13];
        Arrays.fill(cache, 0);
        for(String card: cards) {
            String cardValue = card.substring(1);
            if(cardValue.equals("A")) cache[12]+=1;
            else if(cardValue.equals("J")) cache[9]+=1;
            else if(cardValue.equals("Q")) cache[10]+=1;
            else if(cardValue.equals("K")) cache[11]+=1;
            else cache[Integer.parseInt(cardValue) - 2] += 1;
        }
        ArrayList<Integer> cardRanks = new ArrayList<>(4);
        for(int i = 0; i < cache.length; i++) {
            if(cache[i] == 0){
                continue;
            }
            cardRanks.add(cache[i] * 100 + i);
        }
        Collections.sort(cardRanks);
        Collections.reverse(cardRanks);
        return cardRanks;
    }
}