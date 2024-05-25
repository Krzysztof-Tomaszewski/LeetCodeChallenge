package validParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void testExample1() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("()"));
    }

    @Test
    void testExample2() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void testExample3() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void testNestedParentheses() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("{[()]}"));
    }

    @Test
    void testUnbalancedParentheses() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    void testEmptyString() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid(""));
    }

    @Test
    void testSingleOpeningBracket() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("("));
    }

    @Test
    void testSingleClosingBracket() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid(")"));
    }

    @Test
    void testLongValidString() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("()[]{}{{[[(())]]}}"));
    }

    @Test
    void testLongInvalidString() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("()[]{}{{[[(())]}}"));
    }
}

