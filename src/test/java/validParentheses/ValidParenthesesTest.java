package validParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void testExample1() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("()"));
    }

    @Test
    public void testExample2() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    public void testExample3() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("(]"));
    }

    @Test
    public void testNestedParentheses() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid("{[()]}"));
    }

    @Test
    public void testUnbalancedParentheses() {
        ValidParentheses solution = new ValidParentheses();
        assertFalse(solution.isValid("([)]"));
    }
}
