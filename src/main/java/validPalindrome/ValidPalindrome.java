package validPalindrome;

// Link to the problem: https://leetcode.com/problems/valid-palindrome/description/
// Problem statement:
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
//
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
//
// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

class ValidPalindrome {

    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (left < right) {
            if (!Character.isLetterOrDigit(charArray[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(charArray[right])) {
                right--;
            } else if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}

