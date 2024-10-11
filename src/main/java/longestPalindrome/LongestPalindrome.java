package longestPalindrome;

/*
 * LeetCode Problem: Longest Palindrome
 *
 * Link: https://leetcode.com/problems/longest-palindrome/description/
 *
 * Given a string s which consists of lowercase or uppercase letters, return the length
 * of the longest palindrome that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 *
 * Example 1:
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 * Example 2:
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a".
 *
 * Constraints:
 * - 1 <= s.length <= 2000
 * - s consists of lowercase and/or uppercase English letters only.
 */

import java.util.HashMap;
import java.util.Map;

class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> letterFrequency = new HashMap<>();
        for(char c : s.toCharArray()) {
            letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
        }

        int longestPalindromeLength = letterFrequency.values().stream()
                .map(freq -> {
                    if(freq % 2 != 0) {
                        freq--;
                    }
                    return freq;
                })
                .reduce(0, Integer::sum);

        if(s.length() > longestPalindromeLength) {
            longestPalindromeLength++;
        }

        return longestPalindromeLength;
    }

}


