package validAnagram;

// Problem Link: https://leetcode.com/problems/valid-anagram/description/
// Problem Statement:
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
//
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
//
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
//
// Constraints:
// - 1 <= s.length, t.length <= 5 * 10^4
// - s and t consist of lowercase English letters.

class ValidAnagram {
    boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];  // For 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    boolean isAnagramIgnoringSpecialCharacters(String s, String t) {
        s = preprocessString(s);
        t = preprocessString(t);

        return isAnagram(s, t);
    }

    private String preprocessString(String str) {
        return str.toLowerCase().replaceAll("[^a-z]", "");
    }
}
