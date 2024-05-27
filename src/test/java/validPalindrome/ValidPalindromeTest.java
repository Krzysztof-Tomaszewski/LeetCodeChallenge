package validPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    @Test
    void testExample1() {
        ValidPalindrome solution = new ValidPalindrome();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testExample2() {
        ValidPalindrome solution = new ValidPalindrome();
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void testEmptyString() {
        ValidPalindrome solution = new ValidPalindrome();
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        ValidPalindrome solution = new ValidPalindrome();
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void testNonAlphanumericCharacters() {
        ValidPalindrome solution = new ValidPalindrome();
        assertTrue(solution.isPalindrome(".,"));
    }

    @Test
    void testMixedCasePalindrome() {
        ValidPalindrome solution = new ValidPalindrome();
        assertTrue(solution.isPalindrome("No lemon, no melon"));
    }
}
