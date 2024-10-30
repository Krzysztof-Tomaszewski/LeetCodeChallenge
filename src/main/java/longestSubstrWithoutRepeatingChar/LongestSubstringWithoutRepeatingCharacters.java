package longestSubstrWithoutRepeatingChar;

import java.util.HashMap;
import java.util.Map;

/**
 * Link to the problem:
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Problem description:
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * 1. Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * 2. Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * 3. Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols, and spaces.
 */

class LongestSubstringWithoutRepeatingCharacters {

    // Your solution goes here
    int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> charMap = new HashMap<>();
        int longestSubstr = 1;
        int currentSubstr = 1;
        charMap.put(s.charAt(0), 1);
        for (int i = 1; i < s.length(); i++) {
            if (charMap.getOrDefault(s.charAt(i), 0) >= 1) {
                charMap.replaceAll(((character, integer) -> 0));
                currentSubstr = 1;
            } else {
                currentSubstr++;
                if (currentSubstr > longestSubstr) {
                    longestSubstr = currentSubstr;
                }
            }
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);

        }
        return longestSubstr;
    }
}
