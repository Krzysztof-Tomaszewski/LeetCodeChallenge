package longestPalindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LongestPalindromeTest {

    @Test
    void testEmptyString() {
        LongestPalindrome solution = new LongestPalindrome();
        assertEquals(0, solution.longestPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        LongestPalindrome solution = new LongestPalindrome();
        assertEquals(1, solution.longestPalindrome("a"));
    }

    @Test
    void testAllUniqueCharacters() {
        LongestPalindrome solution = new LongestPalindrome();
        assertEquals(1, solution.longestPalindrome("abcdefg"));
    }

    @Test
    void testEvenCharactersWithPalindrome() {
        LongestPalindrome solution = new LongestPalindrome();
        assertEquals(8, solution.longestPalindrome("aaAAbbcc"));
    }

    @Test
    void testOddNumberOfPalindromeCharacters() {
        LongestPalindrome solution = new LongestPalindrome();
        assertEquals(9, solution.longestPalindrome("AAbcCCCcdd"));
    }
}
