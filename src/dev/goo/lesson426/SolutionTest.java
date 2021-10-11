package dev.goo.lesson426;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void diceStreakGamble() {
        assertEquals("Winner: Player 1 won $12 by rolling [1,2,3]", Solution.diceStreakGamble(new int[]{1,2,3},new int[]{3,4,2},new int[]{4,2,4},new int[]{6,16,4}));
        assertEquals("Winner: Player 1 won $12 by rolling [-1,4,5]", Solution.diceStreakGamble(new int[]{1,2,3,-1,4,5},new int[]{3,4,2},new int[]{4,2,4},new int[]{6,16,4}));
        assertEquals("Winner: Player 1 won $4 by rolling [1]", Solution.diceStreakGamble(new int[]{4,3,2,1},new int[]{4,3,2,1},new int[]{4,3,2,1},new int[]{4,3,2,1}));
        assertEquals("Winner: Player 1 won $12 by rolling [1,2,3]", Solution.diceStreakGamble(new int[]{1,2,3},new int[]{3,4,2},new int[]{4,2,4},new int[]{6,16,26}));
        assertEquals("Winner: Player 4 won $12 by rolling [6,16,26]", Solution.diceStreakGamble(new int[]{1,2,1},new int[]{3,4,2},new int[]{4,2,4},new int[]{6,16,26}));
        assertEquals("Winner: Player 1 won $16 by rolling [5,19,19,20]", Solution.diceStreakGamble(new int[]{5,19,19,20},new int[]{23,23,32,5},new int[]{20,23,30,23},new int[]{12,20,24,29}));
        assertEquals("Winner: Player 1 won $8 by rolling [1,4]", Solution.diceStreakGamble(new int[]{10,9,9,9,1,4},new int[]{10,9,9,9,1,4},new int[]{0,1,3,6,2,8},new int[]{1,2,2,1,0,1}));
        assertEquals("Winner: Player 3 won $40 by rolling [3,4,20,20,21,30,33,35,35,36]", Solution.diceStreakGamble(new int[]{2,45,56,6,4,10,34,20,3,4},new int[]{20,45,56,6,4,3,5,3,2,20},new int[]{3,4,20,20,21,30,33,35,35,36},new int[]{3,4,20,45,56,6,4,3,5,9}));
    }
}