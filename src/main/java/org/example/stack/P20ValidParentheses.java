package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * LeetCode #20 - Valid Parentheses
 * Difficulty: Easy
 * Category: Stack
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given string s containing '(', ')', '{', '}', '[', ']', determine if
 * input is valid: open brackets must be closed by the same type in
 * correct order.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 10^4
 * s consists only of bracket characters '(', ')', '{', '}', '[', ']'
 *
 * EXAMPLES
 * --------
 * "()"      → true
 * "()[]{}"  → true
 * "(]"      → false
 * "([)]"    → false
 * "{[]}"    → true
 *
 * INTUITION & APPROACH
 * --------------------
 * Stack-based. Push open brackets onto stack. For close brackets, check
 * if stack top is the matching open bracket — if not, return false.
 * After processing all characters, valid iff stack is empty.
 *
 * KEY CONCEPTS
 * ------------
 * Stack (ArrayDeque), bracket pair matching
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P20ValidParentheses {

    public boolean isValid(String s) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P20ValidParentheses sol = new P20ValidParentheses();
        System.out.println(sol.isValid("()[]{}")); // expected true
        System.out.println(sol.isValid("(]"));     // expected false
    }
}
