package ransomNote;

// https://leetcode.com/problems/ransom-note/description/
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed
// by using the letters from magazine and false otherwise. Each letter in magazine can only
// be used once in ransomNote.
//
// Example 1:
// Input: ransomNote = "a", magazine = "b"
// Output: false
//
// Example 2:
// Input: ransomNote = "aa", magazine = "ab"
// Output: false
//
// Example 3:
// Input: ransomNote = "aa", magazine = "aab"
// Output: true

import java.util.HashMap;
import java.util.Map;

class RansomNote {

    boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()){
            if(!magazineMap.containsKey(c) || magazineMap.get(c) < 1) return false;
            magazineMap.put(c, magazineMap.get(c) - 1);
        }
        return true;
    }
}

