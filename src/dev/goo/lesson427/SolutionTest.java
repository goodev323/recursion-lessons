package dev.goo.lesson427;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void stockSpan() {
        assertArrayEquals(new int[]{1, 2, 3, 1, 2, 6, 7}, Solution.stockSpan(new int[]{30, 50, 60, 20, 30, 64, 80}));
        assertArrayEquals(new int[]{1, 1, 3, 1, 1, 3, 1, 8, 1}, Solution.stockSpan(new int[]{24, 5, 67, 60, 24, 64, 23, 536, 345}));
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, Solution.stockSpan(new int[]{200, 85, 40, 60, 40, 65, 90}));
        assertArrayEquals(new int[]{1, 2, 1, 4, 5, 6, 7, 1, 2}, Solution.stockSpan(new int[]{30, 45, 20, 100, 235, 300, 4500, 40, 100}));
        assertArrayEquals(new int[]{1, 2, 1, 2, 1, 1, 1, 4, 9, 1}, Solution.stockSpan(new int[]{34, 640, 100, 234, 56, 34, 25, 200, 1020, 160}));
    }
}