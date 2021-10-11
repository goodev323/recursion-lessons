package dev.goo.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void expressionParser() {
        assertEquals(26, Solution.expressionParser("2+4*6"));
        assertEquals(10, Solution.expressionParser("2*3+4"));
        assertEquals(3, Solution.expressionParser("3-3+3"));
        assertEquals(6, Solution.expressionParser("2+2+2"));
        assertEquals(-1, Solution.expressionParser("1-1-1"));
        assertEquals(27, Solution.expressionParser("3*3/3*3*3"));
        assertEquals(8, Solution.expressionParser("14/3*2"));
        assertEquals(16, Solution.expressionParser("12/3*4"));
        assertEquals(55, Solution.expressionParser("1+2+3+4+5+6+7+8+9+10"));
        assertEquals(6, Solution.expressionParser("1+2*5/3+6/4*2"));
        assertEquals(42, Solution.expressionParser("42"));
    }
}