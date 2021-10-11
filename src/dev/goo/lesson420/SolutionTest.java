package dev.goo.lesson420;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestRectangle() {
        assertEquals(6, Solution.largestRectangle(new int[]{3, 2, 3}));
        assertEquals(10, Solution.largestRectangle(new int[]{1, 2, 5, 2, 3, 4}));
        assertEquals(9, Solution.largestRectangle(new int[]{1, 2, 3, 4, 5}));
        assertEquals(16, Solution.largestRectangle(new int[]{3, 4, 5, 8, 10, 2, 1, 3, 9}));
        assertEquals(10, Solution.largestRectangle(new int[]{1, 2, 1, 3, 5, 2, 3, 4}));
        assertEquals(50, Solution.largestRectangle(new int[]{11, 11, 10, 10, 10}));
        assertEquals(26152, Solution.largestRectangle(new int[]{8979, 4570, 6436, 5083, 7780, 3269, 5400, 7579, 2324, 2116}));
    }
}