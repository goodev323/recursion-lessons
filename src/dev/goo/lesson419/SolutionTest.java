package dev.goo.lesson419;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isParenthesesValid() {
        assertEquals(true, Solution.isParenthesesValid("{}"));
        assertEquals(true, Solution.isParenthesesValid("[{}]"));
        assertEquals(false, Solution.isParenthesesValid("[{(]"));
        assertEquals(true, Solution.isParenthesesValid("(){}[]"));
        assertEquals(true, Solution.isParenthesesValid("((()(())))"));
        assertEquals(false, Solution.isParenthesesValid("[{(}])"));
        assertEquals(false, Solution.isParenthesesValid("]][}{({()){}("));
        assertEquals(true, Solution.isParenthesesValid("{(([])[])[]}[]"));
        assertEquals(false, Solution.isParenthesesValid("{(([])[])[]]}"));
        assertEquals(true, Solution.isParenthesesValid("{{[[(())]]}}"));
    }
}