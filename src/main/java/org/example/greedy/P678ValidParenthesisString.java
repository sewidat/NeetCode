package org.example.greedy;

/**
 * ============================================================
 * LeetCode #678 - Valid Parenthesis String
 * Difficulty: Medium
 * Category: Greedy
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s containing only '(', ')', and '*', where '*' can be
 * treated as '(' or ')' or an empty string, return true if s is valid
 * according to the usual parenthesis rules.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= s.length <= 100
 * - s consists of '(', ')', and '*' only
 *
 * EXAMPLES
 * --------
 * Input: s = "()"    Output: true
 * Input: s = "(*)"   Output: true
 * Input: s = "(*))"  Output: true
 * Input: s = "(*("   Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * Track a range [lo, hi] of possible open-parenthesis counts:
 *   - '(' : both lo and hi increase by 1
 *   - ')' : both lo and hi decrease by 1
 *   - '*' : lo decreases by 1 (treat as ')'), hi increases by 1 (treat as '(')
 * If hi < 0 at any point, we have too many ')' — impossible, return false.
 * Clamp lo to 0: lo cannot be negative (a '*' acting as ')' can't reduce an
 * already-zero open count).
 * After the full scan, the string is valid if and only if lo == 0 (it is
 * possible to have exactly zero unmatched '(' ).
 *
 * KEY CONCEPTS
 * ------------
 * - Track (minOpen, maxOpen) range instead of a single count
 * - '*' widens the range: lo--, hi++
 * - Clamp lo at 0; if hi < 0 return false immediately
 * - Valid iff lo == 0 at end
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P678ValidParenthesisString {

    public boolean checkValidString(String s) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        // P678ValidParenthesisString sol = new P678ValidParenthesisString();
        // System.out.println(sol.checkValidString("(*))"));  // true
        // System.out.println(sol.checkValidString("(*(" ));  // false
        // System.out.println(sol.checkValidString("(*)"));   // true
        System.out.println("P678ValidParenthesisString — uncomment examples above to test.");
    }
}
