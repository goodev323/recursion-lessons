package dev.goo.lesson426;

import java.util.ArrayList;

public class Solution {
    public static String diceStreakGamble(int[] player1,int[] player2,int[] player3,int[] player4){
        int[][] players = new int[][]{player1, player2, player3, player4};
        int maxPrizePlayer = 0;
        ArrayList<Integer> maxPrizeSubList = calcSubPrizeList(player1);
        for(int i = 1; i < players.length; i++) {
            ArrayList<Integer> playerSubList = calcSubPrizeList(players[i]);
            if(maxPrizeSubList.size() < playerSubList.size()) {
                maxPrizePlayer = i;
                maxPrizeSubList = playerSubList;
            }
        }
        return "Winner: Player " + (maxPrizePlayer + 1) + " won $" + (maxPrizeSubList.size() * 4) + " by rolling " + toStringSubArray(players[maxPrizePlayer], maxPrizeSubList);
    }

    public static ArrayList<Integer> calcSubPrizeList(int[] player) {
        ArrayList<Integer> subPrizeArray = new ArrayList<>();
        subPrizeArray.add(0);
        for(int i = 1; i < player.length; i++) {
            if(player[subPrizeArray.get(subPrizeArray.size() - 1)] > player[i]) {
                subPrizeArray.clear();
            }
            subPrizeArray.add(i);
        }
        return subPrizeArray;
    }

    public static String toStringSubArray(int[] arr, ArrayList<Integer> indexes) {
        String result = "" + arr[indexes.get(0)];
        for(int i = 1; i < indexes.size(); i++) {
            result += "," + arr[indexes.get(i)];
        }
        return "[" + result + "]";
    }
}
