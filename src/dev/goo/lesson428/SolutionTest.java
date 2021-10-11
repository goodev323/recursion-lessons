package dev.goo.lesson428;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minWindowArrK() {
        assertArrayEquals(new int[]{2,3,1,1,12,3,10}, Solution.minWindowArrK(new int[]{2,3,1,1,12,3,10}, 1));
        assertArrayEquals(new int[]{1,1,1,1,3}, Solution.minWindowArrK(new int[]{2,3,1,1,12,3,10}, 3));
        assertArrayEquals(new int[]{1,1,1,1}, Solution.minWindowArrK(new int[]{2,3,1,1,12,3,10}, 4));
        assertArrayEquals(new int[]{3,2,2,2}, Solution.minWindowArrK(new int[]{3,9,10,2,4,5}, 3));
        assertArrayEquals(new int[]{2,2}, Solution.minWindowArrK(new int[]{3,9,10,2,4,5}, 5));
        assertArrayEquals(new int[]{30,20,20,20,30}, Solution.minWindowArrK(new int[]{30,50,60,20,30,64,80}, 3));
        assertArrayEquals(new int[]{30,50,20,20,30,64}, Solution.minWindowArrK(new int[]{30,50,60,20,30,64,80}, 2));
        assertArrayEquals(new int[]{5,5,24,24,23,23,23}, Solution.minWindowArrK(new int[]{24,5,67,60,24,64,23,536,345}, 3));
        assertArrayEquals(new int[]{1,1,1,2}, Solution.minWindowArrK(new int[]{1, 2, 1, 3, 5, 2, 3, 4}, 5));
    }
}