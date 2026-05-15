package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #115 - Distinct Subsequences
 * Difficulty: Hard
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two strings s and t, return the number of distinct subsequences
 * of s which equal t. The answer fits in a 32-bit integer.
 * A subsequence of a string is a new string generated from the original
 * by deleting some (possibly zero) characters without changing relative order.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length, t.length <= 1000
 * s and t consist of English letters.
 * The answer is guaranteed to fit in a 32-bit integer.
 *
 * EXAMPLES
 * --------
 * s = "rabbbit", t = "rabbit" → 3   (three ways to choose 'b's)
 * s = "babgbag", t = "bag"    → 5
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i][j] = number of distinct subsequences of s[0..i-1] that
 * equal t[0..j-1].
 *
 * Recurrence (at each cell we decide whether to use s[i-1]):
 *   If s[i-1] == t[j-1]:
 *     dp[i][j] = dp[i-1][j-1]   // use s[i-1] to match t[j-1]
 *              + dp[i-1][j]      // skip s[i-1] (don't use this occurrence)
 *   Else:
 *     dp[i][j] = dp[i-1][j]     // must skip s[i-1] (characters differ)
 *
 * Base cases:
 *   dp[i][0] = 1 for all i  (empty t is a subsequence of any prefix of s)
 *   dp[0][j] = 0 for j > 0  (non-empty t cannot be in empty s)
 *
 * KEY CONCEPTS
 * ------------
 * - dp[i][j] = subsequence count of s[0..i-1] matching t[0..j-1]
 * - Match: two choices — use current s char (diagonal) or skip it (above)
 * - No match: must skip current s char (take value from row above)
 * - Base: empty t has exactly 1 subsequence in any string
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — optimizable to O(n)
 * ============================================================
 */
public class P115DistinctSubsequences {
    public int numDistinct(String s, String t) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P115DistinctSubsequences sol = new P115DistinctSubsequences();
        System.out.println(sol.numDistinct("rabbbit", "rabbit")); // 3
        System.out.println(sol.numDistinct("babgbag", "bag"));    // 5
    }
}
