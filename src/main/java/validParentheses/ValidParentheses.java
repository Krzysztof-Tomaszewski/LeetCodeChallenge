package validParentheses;

// Link to the problem: https://leetcode.com/problems/valid-parentheses/description/
// Problem statement:
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
//
// Example 1:
// Input: s = "()"
// Output: true
//
// Example 2:
// Input: s = "()[]{}"
// Output: true
//
// Example 3:
// Input: s = "(]"
// Output: false
//
// Example 4:
// Input: s = "([)]"
// Output: false
//
// Example 5:
// Input: s = "{[]}"
// Output: true

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        try {
            Deque<Character> bracketsStack = new ArrayDeque<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    bracketsStack.push(c);
                } else if (c == ')' && bracketsStack.pop() != '(') {
                    return false;
                } else if (c == ']' && bracketsStack.pop() != '[') {
                    return false;
                } else if (c == '}' && bracketsStack.pop() != '{') {
                    return false;
                }
            }
            return bracketsStack.isEmpty();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

