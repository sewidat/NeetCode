package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #10 - Regular Expression Matching
 * Difficulty: Hard
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an input string s and a pattern p, implement regular expression
 * matching with support for '.' and '*' where:
 *   '.' Matches any single character.
 *   '*' Matches zero or more of the preceding element.
 * The matching must cover the entire input string (not partial).
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 20
 * 1 <= p.length <= 30
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '.', and '*'.
 * It is guaranteed for each occurrence of '*', there will be a valid
 * preceding element to match.
 *
 * EXAMPLES
 * --------
 * s = "aa",  p = "a"   → false  ("a" doesn't match entire "aa")
 * s = "aa",  p = "a*"  → true   ("a*" matches zero or more 'a')
 * s = "ab",  p = ".*"  → true   (".*" matches any sequence)
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i][j] = true if s[0..i-1] matches p[0..j-1].
 *
 * Recurrence:
 *   Case 1 — p[j-1] is a letter or '.':
 *     dp[i][j] = dp[i-1][j-1] && (s[i-1] == p[j-1] || p[j-1] == '.')
 *     (both strings consume one character, must match)
 *
 *   Case 2 — p[j-1] == '*' (preceded by p[j-2]):
 *     Option A — zero occurrences of p[j-2]:
 *       dp[i][j] |= dp[i][j-2]
 *       (skip the "x*" pattern entirely)
 *     Option B — one or more occurrences (if current s char matches p[j-2]):
 *       if s[i-1] == p[j-2] || p[j-2] == '.':
 *         dp[i][j] |= dp[i-1][j]
 *         (consume one matching char from s, keep the "x*" pattern active)
 *
 * Base cases:
 *   dp[0][0] = true (both empty)
 *   dp[0][j]: true if p[0..j-1] can match empty string
 *     (requires "x*" patterns like "a*", "a*b*", etc.)
 *     dp[0][j] = dp[0][j-2] if p[j-1] == '*'
 *
 * KEY CONCEPTS
 * ------------
 * - dp[i][j] = s[0..i-1] fully matched by p[0..j-1]
 * - '*' means zero-or-more of the immediately preceding character/dot
 * - Zero-occurrence: skip "x*" (look at dp[i][j-2])
 * - One-or-more: match char and stay at same pattern position (dp[i-1][j])
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n)
 * ============================================================
 */
public class P10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P10RegularExpressionMatching sol = new P10RegularExpressionMatching();
        System.out.println(sol.isMatch("aa", "a"));   // false
        System.out.println(sol.isMatch("aa", "a*"));  // true
        System.out.println(sol.isMatch("ab", ".*"));  // true
    }
}
