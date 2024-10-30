package longestSubstrWithoutRepeatingChar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void testExample1() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testExample2() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testExample3() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testEmptyString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void testSingleCharacterString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void testLongerStringWithRepeats() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(8, solution.lengthOfLongestSubstring("abcdabcdefgh"));
    }

    @Test
    void testStringWithRepeats() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }


}
