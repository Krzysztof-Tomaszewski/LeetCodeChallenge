package ransomNote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RansomNoteTest {

    @Test
    void testSingleLetterNoMatch() {
        RansomNote ransomNote = new RansomNote();
        assertFalse(ransomNote.canConstruct("a", "b"));
    }

    @Test
    void testMultipleLettersNoMatch() {
        RansomNote ransomNote = new RansomNote();
        assertFalse(ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    void testExactMatch() {
        RansomNote ransomNote = new RansomNote();
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }

    @Test
    void testEmptyRansomNote() {
        RansomNote ransomNote = new RansomNote();
        assertTrue(ransomNote.canConstruct("", "abc"));
    }

    @Test
    void testLongerMagazineWithMatchingLetters() {
        RansomNote ransomNote = new RansomNote();
        assertTrue(ransomNote.canConstruct("abc", "cbadef"));
    }

    @Test
    void testNonMatchingLettersWithSimilarFrequency() {
        RansomNote ransomNote = new RansomNote();
        assertFalse(ransomNote.canConstruct("aabb", "ab"));
    }
}
