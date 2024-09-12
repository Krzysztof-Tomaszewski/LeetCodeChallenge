package validAnagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testValidAnagramSimpleCase() {
        ValidAnagram solution = new ValidAnagram();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testInvalidAnagram() {
        ValidAnagram solution = new ValidAnagram();
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void testEmptyStrings() {
        ValidAnagram solution = new ValidAnagram();
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    void testDifferentLengths() {
        ValidAnagram solution = new ValidAnagram();
        assertFalse(solution.isAnagram("a", "ab"));
    }

    @Test
    void testInvalidAnagramWithSpecialCharacters() {
        ValidAnagram solution = new ValidAnagram();
        assertFalse(solution.isAnagramIgnoringSpecialCharacters("a@n@gram!", "!nagaram@"));
    }

    @Test
    void testAnagramWithSpecialCharacters() {
        ValidAnagram solution = new ValidAnagram();
        assertTrue(solution.isAnagramIgnoringSpecialCharacters("a@nagram!", "!nagaram@"));
    }
}