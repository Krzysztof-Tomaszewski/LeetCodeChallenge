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
        str = str.toLowerCase();

        int l = 0;
        int r = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (l < r) {
            if(!Character.isLetterOrDigit(charArray[l])) {
                l++;
            } else if(!Character.isLetterOrDigit(charArray[r])) {
                r--;
            } else if (charArray[l] != charArray[r]) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}

